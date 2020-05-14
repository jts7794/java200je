package java200je;
import java.util.*;

public class CalendarAfAndBf {

		/**
		 * 
		 * @param d 입력 다음 날을 출력하기 위한 입력 
		 * @return 하루 뒤를 출력
		 */
		 
		public Date afterOneDay(Date d) {
			//d 기준 날짜를 입력
			long dd = d.getTime();
			//밀리세컨드*60초*60분*24시간==하루
			return new Date(dd+1000*60*60*24);
		}
		/**
		 * 
		 * @param d 입력 전 날을 출력하기 위한 입력 
		 * @return 하루 전을 출력
		 */
		public Date beforeOneDay(Date d) {
			//d 기준 날짜를 입력
			long dd = d.getTime();
			//밀리세컨드*60초*60분*24시간 == 하루 
			return new Date(dd-1000*60*60*24);
		}
		
		/*
		public Date setDate(int year,int month, int day) {
			Calendar cal = Calendar.getInstance();
			cal.set(year,month-1,day); //0~11까지 존재하기 때문에
			return new Date(cal.getTimeInMillis());
					
		}
		*/
}

package com.automation.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




	
	public class Log4jUtility
	{
		private static   Logger logger;
		public static Logger getLogger(Object name)
		{
			return logger=LogManager.getLogger(name.getClass());
			
		}
		public static void logInfo(String message)
		{
			logger.info(message);
			
		}
		public static void logError(String message)
		{
			logger.error(message);
		}
	}

	



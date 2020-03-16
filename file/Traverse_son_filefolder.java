package file;
import java.io.File;
public class Traverse_son_filefolder {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		File f = new File("c:/windows");
//		File []fs = f.listFiles();
//		if(null == fs)
//		{
//			System.out.println("无文件");
//		}
//        long max = 0;
//		long min = Integer.MAX_VALUE;
//		File maxfile = null;
//		File minfile = null;
//		
//		for(File f2 : fs)
//		{
//			if(f2.isDirectory())
//			{
//				File f3 = new File("c:/windows"+"/"+f2.getName());
//				File fs2[]=f3.listFiles();
//				if(null!=fs2)//空指针错误是因为没有判断文件夹是否为空
//					for(File f4:fs2)
//				{
//					if(f4.length()>max)
//					{
//						max=f4.length();
//						maxfile = f4;
//					}
//					if(f4.length()<min&&f4.length()!=0)
//					{
//						min = f4.length();
//						minfile = f4;
//					}
//				}
//			}
//			else {
//				
//			}
//		}
//		//这个方法子文件夹的子文件夹无法读取
//		System.out.println("最大文件："+maxfile+"大小 "+max+"字节");
//		System.out.println("最小文件："+minfile+"大小 "+min+"字节");
//	}
//错误，可以使用递归方法；
		
		File f = new File("c:/windows");
		listfile(f);
		System.out.printf("最大的文件：%s，大小是：%d%n",maxFile,maxFile.length());
		System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsoluteFile(),minFile.length());
	}			
	static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;
	public static void listfile(File file)
	{
		if(file.isFile())
		{
			if(file.length()>maxSize)
			{
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
            return;
		}
		if(file.isDirectory())
		{
			File[]fs = file.listFiles();
			if(null!=fs)
			{
				for(File f:fs)
				{
					listfile(f);
				}
			}
		}
	}
	
	
	
	
}

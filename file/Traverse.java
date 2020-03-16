package file;
import java.io.File;
public class Traverse {//遍历
	/*
	一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。

	遍历这个目录下所有的文件(不用遍历子目录)

	找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名

	注: 最小的文件不能是0长度 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("C:\\windows");
			File []fs = f.listFiles();
			if(null == fs)
			{
				System.out.println("无文件");
			}
			long max = 0;
			long min = Integer.MAX_VALUE;
			File maxfile = null;
			File minfile = null;
			for(File f2 : fs)
			{
				if(f2.length()>max)
				{
					max=f2.length();
					maxfile = f2;
				}
				if(f2.length()!=0&&f2.length()<min)
				{
					min = f2.length();
					minfile = f2;
				}
			}
			System.out.println("最小："+minfile+",大小是："+min+"字节");
			System.out.println("最大："+maxfile+",大小是："+max+"字节");
	}

}

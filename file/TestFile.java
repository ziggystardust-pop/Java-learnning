package file;
import java.io.File;
import java.util.Date;
public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 绝对路径
		File f1 = new File("d:/LOLFolder");
		System.out.println("f2的绝对路径："+f1.getAbsolutePath());
		// 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
		File f2 = new File("LOL.exe");
		System.out.println("f2的绝对路径："+f2.getAbsolutePath());
		// 把f1作为父目录创建文件对象
		File f3 = new File(f1,"LOL.exe");
		System.out.println("f3 的绝对路径："+f3.getAbsolutePath());
		System.out.println("当前文件是："+f3);
		 //文件是否存在
		System.out.println("判断是否存在："+f3.exists());
		//是否是文件夹
		System.out.println("判断是否是文件夹："+f3.isDirectory());
		//是否是文件（非文件夹）
		System.out.println("判断是否是文件："+f3.isFile());
		 //文件长度
		System.out.println("获取文件的长度："+f3.length());
		//文件最后的修改时间
		long time  = f3.lastModified();
		Date d  = new Date(time);
		System.out.println("获取文件的最后修改时间："+d);
		//设置文件修改时间为1970.1.1 08:00:00
		f3.setLastModified(0);
		System.out.println(d);
		//文件重命名
		File f4 = new File("d:/LOLFolder/DOTA.exe");
		f3.renameTo(f4);
	
	}

}

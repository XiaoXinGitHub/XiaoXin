package edu.hunau.love.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import edu.hunau.love.pojo.SchoolMate;

public class FileUpUtils {

	public static String upFile(HttpServletRequest request,HttpServletResponse response,String file) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}  
        response.setCharacterEncoding("utf-8");  
        //1、创建一个DiskFileItemFactory工厂  
        DiskFileItemFactory factory = new DiskFileItemFactory();  
        //2、创建一个文件上传解析器  
        ServletFileUpload upload = new ServletFileUpload(factory);  
        //解决上传文件名的中文乱码  
        upload.setHeaderEncoding("UTF-8");   
        factory.setSizeThreshold(1024 * 500);//设置内存的临界值为500k
        File linshi = new File("D:\\linshi");//当超过500K的时候，存到一个临时文件夹中  
        factory.setRepository(linshi);  
        upload.setSizeMax(1024 * 1024 * 5);//设置上传的文件总的大小不能超过5M  
        String fileName=null;
        String files=null;
        try {  
            // 1. 得到 FileItem 的集合 items  
            List<FileItem> /* FileItem */items = upload.parseRequest(request);  
            // 2. 遍历 items:  
            for (FileItem item : items) {  
                // 若是一个一般的表单域, 打印信息  
                if (item.isFormField()) {  
                    String name = item.getFieldName();  
                    String value=null;
					try {
						value = item.getString("utf-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}  
                    System.out.println(name + ": " + value);        
                }  
                // 若是文件域则把文件保存到 D:\STSworkspace\love\src\main\webapp\images\activity\\ 目录下.  
                else {  
                	fileName = item.getName(); 
                	files=fileName;
                	System.out.println(files);
                    long sizeInBytes = item.getSize();  
                    System.out.println(fileName);  
                    System.out.println(sizeInBytes);  
                    InputStream in = item.getInputStream();  
                    byte[] buffer = new byte[1024];  
                    int len = 0;  
                  fileName = file+ fileName;//文件最终上传的位置  
                    System.out.println(fileName);  
                    OutputStream out = new FileOutputStream(fileName);  
                    while ((len = in.read(buffer)) != -1) {  
                        out.write(buffer, 0, len);  
                    }
                    out.flush();
                    out.close();  
                    in.close();  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return files;
    }  
	
	public static SchoolMate upFile2(HttpServletRequest request,HttpServletResponse response,String file) {
		SchoolMate schoolmate=new SchoolMate();
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}  
        response.setCharacterEncoding("utf-8");  
        //1、创建一个DiskFileItemFactory工厂  
        DiskFileItemFactory factory = new DiskFileItemFactory();  
        //2、创建一个文件上传解析器  
        ServletFileUpload upload = new ServletFileUpload(factory);  
        //解决上传文件名的中文乱码  
        upload.setHeaderEncoding("UTF-8");   
        factory.setSizeThreshold(1024 * 500);//设置内存的临界值为500k
        File linshi = new File("D:\\linshi");//当超过500K的时候，存到一个临时文件夹中  
        factory.setRepository(linshi);  
        upload.setSizeMax(1024 * 1024 * 5);//设置上传的文件总的大小不能超过5M  
        String fileName=null;
        String files=null;
        try {  
            // 1. 得到 FileItem 的集合 items  
            List<FileItem> /* FileItem */items = upload.parseRequest(request);  
            // 2. 遍历 items:  
            for (FileItem item : items) {  
                // 若是一个一般的表单域, 打印信息  
                if (item.isFormField()) {  
                    String name = item.getFieldName();  
                    String value=null;
					try {
						value = item.getString("utf-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}  
                    System.out.println(name + ": " + value);
                    schoolmate.setSchoolmateInfo(value);
                }  
                // 若是文件域则把文件保存到 D:\STSworkspace\love\src\main\webapp\images\activity\\ 目录下.  
                else {  
                	fileName = item.getName(); 
                	files=fileName;
                	System.out.println(files);
                    long sizeInBytes = item.getSize();  
                    System.out.println(fileName);  
                    System.out.println(sizeInBytes);  
                    InputStream in = item.getInputStream();  
                    byte[] buffer = new byte[1024];  
                    int len = 0;  
                  fileName = file+ fileName;//文件最终上传的位置  
                    System.out.println(fileName);  
                    OutputStream out = new FileOutputStream(fileName);  
                    while ((len = in.read(buffer)) != -1) {  
                        out.write(buffer, 0, len);  
                    }  
                    out.flush();
                    out.close(); 
                    in.close();  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        schoolmate.setSchoolmateImg("..//images/gallery/"+files);
        return schoolmate;
    }  
}

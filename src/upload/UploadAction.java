package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件上传处理类
 * @author Administrator
 *
 */
public class UploadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String title;
	private File upload;//封装上传文件域的属性
	private String uploadContentType;//封装上传文件类型的属性
	private String uploadFileName;//封装上传文件名的属性
	private String savePath;//直接在struts.xml文件中配置的属性
	
	/**
	 * 默认的处理方法
	 */
	public String execute() throws Exception{
		//以服务器的文件保存地址和原文件名建立上传文件输出流
		FileOutputStream fos = new FileOutputStream(this.getSavePath() + File.pathSeparator + this.getUploadFileName());
		FileInputStream fis = new FileInputStream(this.getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = fis.read(buffer)) > 0){
			fos.write(buffer, 0, len);
		}
		fos.close();
		fis.close();
		return SUCCESS;
	}
	
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath("/WEB-INF/" + savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return (this.upload);
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
}

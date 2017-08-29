package actions;

import java.text.DateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TimeAction extends ActionSupport {

	private String time;
	private String callback;

	public TimeAction(){
		time = "{\"time\":\"" + DateFormat.getDateTimeInstance().format(new Date()) + "\"}";  /*初始化时间*/
	}

	@Override
	public String execute() throws Exception {
		if(callback != null){
			time = callback + "(" + time + ")";
		}

		return "time";
	}

	public String getTime() {
		return time;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public void setTime(String time) {
		this.time = time;
	}




}

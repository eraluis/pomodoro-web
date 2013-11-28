package msc.pomodoro.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name = Activity.FIND_ALL, query = "SELECT a FROM Activity a")
@XmlRootElement
public class Activity {	
	
	public static final String FIND_ALL = "Activity.findAll";
		
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String title;
	private String description;
	private Date dueDate;
	private Integer estimatedPoms;
	private Integer usedPoms;	
	private Integer expandedPoms;
	private String userId;
	
	public Activity(){
		this(null, null);
	}
	
	public Activity(String title, Integer estimatedPoms){
		this.setTitle(title);
		this.setEstimatedPoms(estimatedPoms);
		this.setUsedPoms(0);
		this.setExpandedPoms(0);		
	}	

	//Getters and setters...
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getEstimatedPoms() {
		return estimatedPoms;
	}

	public void setEstimatedPoms(Integer estimatedPoms) {
		this.estimatedPoms = estimatedPoms;
	}

	public Integer getUsedPoms() {
		return usedPoms;
	}

	public void setUsedPoms(Integer usedPoms) {
		this.usedPoms = usedPoms;
	}

	public Integer getExpandedPoms() {
		return expandedPoms;
	}

	public void setExpandedPoms(Integer expandedPoms) {
		this.expandedPoms = expandedPoms;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Activity");
        sb.append(", id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description=").append(description);
        sb.append(", dueDate='").append(dueDate).append('\'');
        sb.append(", estimatedPoms='").append(estimatedPoms).append('\'');
        sb.append(", usedPoms='").append(usedPoms).append('\'');
        sb.append(", expandedPoms='").append(expandedPoms).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

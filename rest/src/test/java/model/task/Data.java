
package model.task;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "creator_id",
    "owner_id",
    "resource_type",
    "resource_id",
    "completed",
    "completed_at",
    "due_date",
    "overdue",
    "remind_at",
    "content",
    "created_at",
    "updated_at"
})
public class Data {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("creator_id")
    private Integer creatorId;
    @JsonProperty("owner_id")
    private Integer ownerId;
    @JsonProperty("resource_type")
    private String resourceType;
    @JsonProperty("resource_id")
    private Integer resourceId;
    @JsonProperty("completed")
    private Boolean completed;
    @JsonProperty("completed_at")
    private String completedAt;
    @JsonProperty("due_date")
    private String dueDate;
    @JsonProperty("overdue")
    private Boolean overdue;
    @JsonProperty("remind_at")
    private String remindAt;
    @JsonProperty("content")
    private String content;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Data withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("creator_id")
    public Integer getCreatorId() {
        return creatorId;
    }

    @JsonProperty("creator_id")
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Data withCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    @JsonProperty("owner_id")
    public Integer getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner_id")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Data withOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    @JsonProperty("resource_type")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resource_type")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Data withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @JsonProperty("resource_id")
    public Integer getResourceId() {
        return resourceId;
    }

    @JsonProperty("resource_id")
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Data withResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @JsonProperty("completed")
    public Boolean getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Data withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    @JsonProperty("completed_at")
    public String getCompletedAt() {
        return completedAt;
    }

    @JsonProperty("completed_at")
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public Data withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    @JsonProperty("due_date")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Data withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    @JsonProperty("overdue")
    public Boolean getOverdue() {
        return overdue;
    }

    @JsonProperty("overdue")
    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    public Data withOverdue(Boolean overdue) {
        this.overdue = overdue;
        return this;
    }

    @JsonProperty("remind_at")
    public String getRemindAt() {
        return remindAt;
    }

    @JsonProperty("remind_at")
    public void setRemindAt(String remindAt) {
        this.remindAt = remindAt;
    }

    public Data withRemindAt(String remindAt) {
        this.remindAt = remindAt;
        return this;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Data withContent(String content) {
        this.content = content;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Data withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Data withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("creatorId", creatorId).append("ownerId", ownerId).append("resourceType", resourceType).append("resourceId", resourceId).append("completed", completed).append("completedAt", completedAt).append("dueDate", dueDate).append("overdue", overdue).append("remindAt", remindAt).append("content", content).append("createdAt", createdAt).append("updatedAt", updatedAt).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ownerId).append(creatorId).append(completedAt).append(resourceType).append(updatedAt).append(content).append(id).append(remindAt).append(resourceId).append(overdue).append(additionalProperties).append(createdAt).append(dueDate).append(completed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(ownerId, rhs.ownerId).append(creatorId, rhs.creatorId).append(completedAt, rhs.completedAt).append(resourceType, rhs.resourceType).append(updatedAt, rhs.updatedAt).append(content, rhs.content).append(id, rhs.id).append(remindAt, rhs.remindAt).append(resourceId, rhs.resourceId).append(overdue, rhs.overdue).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(dueDate, rhs.dueDate).append(completed, rhs.completed).isEquals();
    }

}

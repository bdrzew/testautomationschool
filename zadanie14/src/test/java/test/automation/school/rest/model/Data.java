
package test.automation.school.rest.model;

import java.util.HashMap;
import java.util.List;
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
    "first_name",
    "last_name",
    "organization_name",
    "source_id",
    "title",
    "description",
    "industry",
    "website",
    "email",
    "phone",
    "mobile",
    "fax",
    "twitter",
    "facebook",
    "linkedin",
    "skype",
    "address",
    "tags",
    "custom_fields"
})
public class Data {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("organization_name")
    private String organizationName;
    @JsonProperty("source_id")
    private Integer sourceId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("website")
    private String website;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("linkedin")
    private String linkedin;
    @JsonProperty("skype")
    private String skype;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Data withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Data withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("organization_name")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organization_name")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Data withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    @JsonProperty("source_id")
    public Integer getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Data withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Data withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Data withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Data withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public Data withWebsite(String website) {
        this.website = website;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Data withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Data withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Data withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Data withFax(String fax) {
        this.fax = fax;
        return this;
    }

    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Data withTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Data withFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    @JsonProperty("linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    @JsonProperty("linkedin")
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public Data withLinkedin(String linkedin) {
        this.linkedin = linkedin;
        return this;
    }

    @JsonProperty("skype")
    public String getSkype() {
        return skype;
    }

    @JsonProperty("skype")
    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Data withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Data withAddress(Address address) {
        this.address = address;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Data withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("custom_fields")
    public CustomFields getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Data withCustomFields(CustomFields customFields) {
        this.customFields = customFields;
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
        return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName).append("organizationName", organizationName).append("sourceId", sourceId).append("title", title).append("description", description).append("industry", industry).append("website", website).append("email", email).append("phone", phone).append("mobile", mobile).append("fax", fax).append("twitter", twitter).append("facebook", facebook).append("linkedin", linkedin).append("skype", skype).append("address", address).append("tags", tags).append("customFields", customFields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(lastName).append(phone).append(fax).append(customFields).append(website).append(organizationName).append(linkedin).append(sourceId).append(twitter).append(title).append(address).append(email).append(additionalProperties).append(description).append(facebook).append(industry).append(firstName).append(skype).append(mobile).toHashCode();
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
        return new EqualsBuilder().append(tags, rhs.tags).append(lastName, rhs.lastName).append(phone, rhs.phone).append(fax, rhs.fax).append(customFields, rhs.customFields).append(website, rhs.website).append(organizationName, rhs.organizationName).append(linkedin, rhs.linkedin).append(sourceId, rhs.sourceId).append(twitter, rhs.twitter).append(title, rhs.title).append(address, rhs.address).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(facebook, rhs.facebook).append(industry, rhs.industry).append(firstName, rhs.firstName).append(skype, rhs.skype).append(mobile, rhs.mobile).isEquals();
    }

}

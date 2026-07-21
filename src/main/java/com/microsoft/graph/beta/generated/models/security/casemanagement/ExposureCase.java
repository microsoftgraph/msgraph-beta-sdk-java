package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExposureCase extends CaseEscaped implements Parsable {
    /**
     * Instantiates a new {@link ExposureCase} and sets the default values.
     */
    public ExposureCase() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.exposureCase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExposureCase}
     */
    @jakarta.annotation.Nonnull
    public static ExposureCase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExposureCase();
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the automation property value. The automation property
     * @return a {@link ExposureCaseAutomation}
     */
    @jakarta.annotation.Nullable
    public ExposureCaseAutomation getAutomation() {
        return this.backingStore.get("automation");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the dueDateTime property value. The dueDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * Gets the emailNotificationRecipients property value. The emailNotificationRecipients property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailNotificationRecipients() {
        return this.backingStore.get("emailNotificationRecipients");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("automation", (n) -> { this.setAutomation(n.getObjectValue(ExposureCaseAutomation::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("emailNotificationRecipients", (n) -> { this.setEmailNotificationRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("github", (n) -> { this.setGithub(n.getObjectValue(ExposureCaseGitHub::createFromDiscriminatorValue)); });
        deserializerMap.put("isGracePeriodEnabled", (n) -> { this.setIsGracePeriodEnabled(n.getBooleanValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getStringValue()); });
        deserializerMap.put("seemplicity", (n) -> { this.setSeemplicity(n.getObjectValue(ExposureCaseSeemplicity::createFromDiscriminatorValue)); });
        deserializerMap.put("thirdPartyWorkItem", (n) -> { this.setThirdPartyWorkItem(n.getObjectValue(ThirdPartyWorkItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the github property value. The github property
     * @return a {@link ExposureCaseGitHub}
     */
    @jakarta.annotation.Nullable
    public ExposureCaseGitHub getGithub() {
        return this.backingStore.get("github");
    }
    /**
     * Gets the isGracePeriodEnabled property value. The isGracePeriodEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsGracePeriodEnabled() {
        return this.backingStore.get("isGracePeriodEnabled");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the seemplicity property value. The seemplicity property
     * @return a {@link ExposureCaseSeemplicity}
     */
    @jakarta.annotation.Nullable
    public ExposureCaseSeemplicity getSeemplicity() {
        return this.backingStore.get("seemplicity");
    }
    /**
     * Gets the thirdPartyWorkItem property value. The thirdPartyWorkItem property
     * @return a {@link ThirdPartyWorkItem}
     */
    @jakarta.annotation.Nullable
    public ThirdPartyWorkItem getThirdPartyWorkItem() {
        return this.backingStore.get("thirdPartyWorkItem");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeObjectValue("automation", this.getAutomation());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeCollectionOfPrimitiveValues("emailNotificationRecipients", this.getEmailNotificationRecipients());
        writer.writeObjectValue("github", this.getGithub());
        writer.writeBooleanValue("isGracePeriodEnabled", this.getIsGracePeriodEnabled());
        writer.writeStringValue("priority", this.getPriority());
        writer.writeObjectValue("seemplicity", this.getSeemplicity());
        writer.writeObjectValue("thirdPartyWorkItem", this.getThirdPartyWorkItem());
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the automation property value. The automation property
     * @param value Value to set for the automation property.
     */
    public void setAutomation(@jakarta.annotation.Nullable final ExposureCaseAutomation value) {
        this.backingStore.set("automation", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the dueDateTime property value. The dueDateTime property
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the emailNotificationRecipients property value. The emailNotificationRecipients property
     * @param value Value to set for the emailNotificationRecipients property.
     */
    public void setEmailNotificationRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("emailNotificationRecipients", value);
    }
    /**
     * Sets the github property value. The github property
     * @param value Value to set for the github property.
     */
    public void setGithub(@jakarta.annotation.Nullable final ExposureCaseGitHub value) {
        this.backingStore.set("github", value);
    }
    /**
     * Sets the isGracePeriodEnabled property value. The isGracePeriodEnabled property
     * @param value Value to set for the isGracePeriodEnabled property.
     */
    public void setIsGracePeriodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isGracePeriodEnabled", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the seemplicity property value. The seemplicity property
     * @param value Value to set for the seemplicity property.
     */
    public void setSeemplicity(@jakarta.annotation.Nullable final ExposureCaseSeemplicity value) {
        this.backingStore.set("seemplicity", value);
    }
    /**
     * Sets the thirdPartyWorkItem property value. The thirdPartyWorkItem property
     * @param value Value to set for the thirdPartyWorkItem property.
     */
    public void setThirdPartyWorkItem(@jakarta.annotation.Nullable final ThirdPartyWorkItem value) {
        this.backingStore.set("thirdPartyWorkItem", value);
    }
}

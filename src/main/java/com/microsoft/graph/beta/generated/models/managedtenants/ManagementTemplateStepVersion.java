package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateStepVersion extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagementTemplateStepVersion} and sets the default values.
     */
    public ManagementTemplateStepVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagementTemplateStepVersion}
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateStepVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepVersion();
    }
    /**
     * Gets the acceptedFor property value. The acceptedFor property
     * @return a {@link ManagementTemplateStep}
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStep getAcceptedFor() {
        return this.backingStore.get("acceptedFor");
    }
    /**
     * Gets the contentMarkdown property value. The contentMarkdown property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentMarkdown() {
        return this.backingStore.get("contentMarkdown");
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.backingStore.get("createdByUserId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deployments property value. The deployments property
     * @return a {@link java.util.List<ManagementTemplateStepDeployment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepDeployment> getDeployments() {
        return this.backingStore.get("deployments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedFor", (n) -> { this.setAcceptedFor(n.getObjectValue(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("contentMarkdown", (n) -> { this.setContentMarkdown(n.getStringValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deployments", (n) -> { this.setDeployments(n.getCollectionOfObjectValues(ManagementTemplateStepDeployment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("templateStep", (n) -> { this.setTemplateStep(n.getObjectValue(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("versionInformation", (n) -> { this.setVersionInformation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.backingStore.get("lastActionByUserId");
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the templateStep property value. The templateStep property
     * @return a {@link ManagementTemplateStep}
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStep getTemplateStep() {
        return this.backingStore.get("templateStep");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the versionInformation property value. The versionInformation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionInformation() {
        return this.backingStore.get("versionInformation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("acceptedFor", this.getAcceptedFor());
        writer.writeStringValue("contentMarkdown", this.getContentMarkdown());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("templateStep", this.getTemplateStep());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeStringValue("versionInformation", this.getVersionInformation());
    }
    /**
     * Sets the acceptedFor property value. The acceptedFor property
     * @param value Value to set for the acceptedFor property.
     */
    public void setAcceptedFor(@jakarta.annotation.Nullable final ManagementTemplateStep value) {
        this.backingStore.set("acceptedFor", value);
    }
    /**
     * Sets the contentMarkdown property value. The contentMarkdown property
     * @param value Value to set for the contentMarkdown property.
     */
    public void setContentMarkdown(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentMarkdown", value);
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByUserId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deployments property value. The deployments property
     * @param value Value to set for the deployments property.
     */
    public void setDeployments(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepDeployment> value) {
        this.backingStore.set("deployments", value);
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastActionByUserId", value);
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the templateStep property value. The templateStep property
     * @param value Value to set for the templateStep property.
     */
    public void setTemplateStep(@jakarta.annotation.Nullable final ManagementTemplateStep value) {
        this.backingStore.set("templateStep", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the versionInformation property value. The versionInformation property
     * @param value Value to set for the versionInformation property.
     */
    public void setVersionInformation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionInformation", value);
    }
}

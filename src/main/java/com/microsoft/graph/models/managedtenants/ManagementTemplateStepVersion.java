package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
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
     * The acceptedFor property
     */
    private ManagementTemplateStep acceptedFor;
    /**
     * The contentMarkdown property
     */
    private String contentMarkdown;
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The deployments property
     */
    private java.util.List<ManagementTemplateStepDeployment> deployments;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The name property
     */
    private String name;
    /**
     * The templateStep property
     */
    private ManagementTemplateStep templateStep;
    /**
     * The version property
     */
    private Integer version;
    /**
     * The versionInformation property
     */
    private String versionInformation;
    /**
     * Instantiates a new managementTemplateStepVersion and sets the default values.
     */
    public ManagementTemplateStepVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateStepVersion
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateStepVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepVersion();
    }
    /**
     * Gets the acceptedFor property value. The acceptedFor property
     * @return a managementTemplateStep
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStep getAcceptedFor() {
        return this.acceptedFor;
    }
    /**
     * Gets the contentMarkdown property value. The contentMarkdown property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentMarkdown() {
        return this.contentMarkdown;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deployments property value. The deployments property
     * @return a managementTemplateStepDeployment
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepDeployment> getDeployments() {
        return this.deployments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the templateStep property value. The templateStep property
     * @return a managementTemplateStep
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStep getTemplateStep() {
        return this.templateStep;
    }
    /**
     * Gets the version property value. The version property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Gets the versionInformation property value. The versionInformation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersionInformation() {
        return this.versionInformation;
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
        this.acceptedFor = value;
    }
    /**
     * Sets the contentMarkdown property value. The contentMarkdown property
     * @param value Value to set for the contentMarkdown property.
     */
    public void setContentMarkdown(@jakarta.annotation.Nullable final String value) {
        this.contentMarkdown = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deployments property value. The deployments property
     * @param value Value to set for the deployments property.
     */
    public void setDeployments(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepDeployment> value) {
        this.deployments = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the templateStep property value. The templateStep property
     * @param value Value to set for the templateStep property.
     */
    public void setTemplateStep(@jakarta.annotation.Nullable final ManagementTemplateStep value) {
        this.templateStep = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
    /**
     * Sets the versionInformation property value. The versionInformation property
     * @param value Value to set for the versionInformation property.
     */
    public void setVersionInformation(@jakarta.annotation.Nullable final String value) {
        this.versionInformation = value;
    }
}

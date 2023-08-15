package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementTemplateStepDeployment extends Entity implements Parsable {
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The error property
     */
    private GraphAPIErrorDetails error;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The status property
     */
    private ManagementTemplateDeploymentStatus status;
    /**
     * The templateStepVersion property
     */
    private ManagementTemplateStepVersion templateStepVersion;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * Instantiates a new managementTemplateStepDeployment and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepDeployment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateStepDeployment
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplateStepDeployment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepDeployment();
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
     * Gets the error property value. The error property
     * @return a graphAPIErrorDetails
     */
    @jakarta.annotation.Nullable
    public GraphAPIErrorDetails getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(GraphAPIErrorDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ManagementTemplateDeploymentStatus.class)); });
        deserializerMap.put("templateStepVersion", (n) -> { this.setTemplateStepVersion(n.getObjectValue(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
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
     * Gets the status property value. The status property
     * @return a managementTemplateDeploymentStatus
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateDeploymentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the templateStepVersion property value. The templateStepVersion property
     * @return a managementTemplateStepVersion
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion getTemplateStepVersion() {
        return this.templateStepVersion;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("templateStepVersion", this.getTemplateStepVersion());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setError(@jakarta.annotation.Nullable final GraphAPIErrorDetails value) {
        this.error = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final ManagementTemplateDeploymentStatus value) {
        this.status = value;
    }
    /**
     * Sets the templateStepVersion property value. The templateStepVersion property
     * @param value Value to set for the templateStepVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTemplateStepVersion(@jakarta.annotation.Nullable final ManagementTemplateStepVersion value) {
        this.templateStepVersion = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}

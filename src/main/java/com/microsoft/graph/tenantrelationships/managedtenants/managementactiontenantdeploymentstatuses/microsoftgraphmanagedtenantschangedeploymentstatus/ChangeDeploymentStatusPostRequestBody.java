package com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.microsoftgraphmanagedtenantschangedeploymentstatus;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangeDeploymentStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The managementActionId property
     */
    private String managementActionId;
    /**
     * The managementTemplateId property
     */
    private String managementTemplateId;
    /**
     * The managementTemplateVersion property
     */
    private Integer managementTemplateVersion;
    /**
     * The status property
     */
    private String status;
    /**
     * The tenantGroupId property
     */
    private String tenantGroupId;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * Instantiates a new changeDeploymentStatusPostRequestBody and sets the default values.
     */
    public ChangeDeploymentStatusPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeDeploymentStatusPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ChangeDeploymentStatusPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeDeploymentStatusPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("managementActionId", (n) -> { this.setManagementActionId(n.getStringValue()); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("managementTemplateVersion", (n) -> { this.setManagementTemplateVersion(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("tenantGroupId", (n) -> { this.setTenantGroupId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managementActionId property value. The managementActionId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagementActionId() {
        return this.managementActionId;
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagementTemplateId() {
        return this.managementTemplateId;
    }
    /**
     * Gets the managementTemplateVersion property value. The managementTemplateVersion property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getManagementTemplateVersion() {
        return this.managementTemplateVersion;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the tenantGroupId property value. The tenantGroupId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantGroupId() {
        return this.tenantGroupId;
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managementActionId", this.getManagementActionId());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeIntegerValue("managementTemplateVersion", this.getManagementTemplateVersion());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the managementActionId property value. The managementActionId property
     * @param value Value to set for the managementActionId property.
     */
    public void setManagementActionId(@jakarta.annotation.Nullable final String value) {
        this.managementActionId = value;
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     */
    public void setManagementTemplateId(@jakarta.annotation.Nullable final String value) {
        this.managementTemplateId = value;
    }
    /**
     * Sets the managementTemplateVersion property value. The managementTemplateVersion property
     * @param value Value to set for the managementTemplateVersion property.
     */
    public void setManagementTemplateVersion(@jakarta.annotation.Nullable final Integer value) {
        this.managementTemplateVersion = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the tenantGroupId property value. The tenantGroupId property
     * @param value Value to set for the tenantGroupId property.
     */
    public void setTenantGroupId(@jakarta.annotation.Nullable final String value) {
        this.tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}

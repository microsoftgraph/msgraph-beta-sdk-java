package com.microsoft.graph.tenantrelationships.managedtenants.managementactions.item.microsoftgraphmanagedtenantsapply;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplyPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The excludeGroups property
     */
    private java.util.List<String> excludeGroups;
    /**
     * The includeAllUsers property
     */
    private Boolean includeAllUsers;
    /**
     * The includeGroups property
     */
    private java.util.List<String> includeGroups;
    /**
     * The managementTemplateId property
     */
    private String managementTemplateId;
    /**
     * The tenantGroupId property
     */
    private String tenantGroupId;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * Instantiates a new applyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ApplyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludeGroups property value. The excludeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this.excludeGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("excludeGroups", (n) -> { this.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAllUsers", (n) -> { this.setIncludeAllUsers(n.getBooleanValue()); });
        deserializerMap.put("includeGroups", (n) -> { this.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("managementTemplateId", (n) -> { this.setManagementTemplateId(n.getStringValue()); });
        deserializerMap.put("tenantGroupId", (n) -> { this.setTenantGroupId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeAllUsers property value. The includeAllUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeAllUsers() {
        return this.includeAllUsers;
    }
    /**
     * Gets the includeGroups property value. The includeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this.includeGroups;
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateId() {
        return this.managementTemplateId;
    }
    /**
     * Gets the tenantGroupId property value. The tenantGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantGroupId() {
        return this.tenantGroupId;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeBooleanValue("includeAllUsers", this.getIncludeAllUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludeGroups property value. The excludeGroups property
     * @param value Value to set for the excludeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeGroups = value;
    }
    /**
     * Sets the includeAllUsers property value. The includeAllUsers property
     * @param value Value to set for the includeAllUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeAllUsers(@javax.annotation.Nullable final Boolean value) {
        this.includeAllUsers = value;
    }
    /**
     * Sets the includeGroups property value. The includeGroups property
     * @param value Value to set for the includeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeGroups = value;
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateId(@javax.annotation.Nullable final String value) {
        this.managementTemplateId = value;
    }
    /**
     * Sets the tenantGroupId property value. The tenantGroupId property
     * @param value Value to set for the tenantGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantGroupId(@javax.annotation.Nullable final String value) {
        this.tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}

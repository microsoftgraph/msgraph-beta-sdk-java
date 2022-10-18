package com.microsoft.graph.tenantrelationships.managedtenants.managementactions.item.apply;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the apply method. */
public class ApplyPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The excludeGroups property */
    private java.util.List<String> _excludeGroups;
    /** The includeAllUsers property */
    private Boolean _includeAllUsers;
    /** The includeGroups property */
    private java.util.List<String> _includeGroups;
    /** The managementTemplateId property */
    private String _managementTemplateId;
    /** The tenantGroupId property */
    private String _tenantGroupId;
    /** The tenantId property */
    private String _tenantId;
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
        return this._additionalData;
    }
    /**
     * Gets the excludeGroups property value. The excludeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this._excludeGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplyPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("excludeGroups", (n) -> { currentObject.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeAllUsers", (n) -> { currentObject.setIncludeAllUsers(n.getBooleanValue()); });
            this.put("includeGroups", (n) -> { currentObject.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("managementTemplateId", (n) -> { currentObject.setManagementTemplateId(n.getStringValue()); });
            this.put("tenantGroupId", (n) -> { currentObject.setTenantGroupId(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the includeAllUsers property value. The includeAllUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeAllUsers() {
        return this._includeAllUsers;
    }
    /**
     * Gets the includeGroups property value. The includeGroups property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this._includeGroups;
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateId() {
        return this._managementTemplateId;
    }
    /**
     * Gets the tenantGroupId property value. The tenantGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantGroupId() {
        return this._tenantGroupId;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the excludeGroups property value. The excludeGroups property
     * @param value Value to set for the excludeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeGroups = value;
    }
    /**
     * Sets the includeAllUsers property value. The includeAllUsers property
     * @param value Value to set for the includeAllUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeAllUsers(@javax.annotation.Nullable final Boolean value) {
        this._includeAllUsers = value;
    }
    /**
     * Sets the includeGroups property value. The includeGroups property
     * @param value Value to set for the includeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeGroups = value;
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateId(@javax.annotation.Nullable final String value) {
        this._managementTemplateId = value;
    }
    /**
     * Sets the tenantGroupId property value. The tenantGroupId property
     * @param value Value to set for the tenantGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantGroupId(@javax.annotation.Nullable final String value) {
        this._tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}

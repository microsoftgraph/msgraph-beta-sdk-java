package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FormsSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The isBingImageSearchEnabled property
     */
    private Boolean isBingImageSearchEnabled;
    /**
     * The isExternalSendFormEnabled property
     */
    private Boolean isExternalSendFormEnabled;
    /**
     * The isExternalShareCollaborationEnabled property
     */
    private Boolean isExternalShareCollaborationEnabled;
    /**
     * The isExternalShareResultEnabled property
     */
    private Boolean isExternalShareResultEnabled;
    /**
     * The isExternalShareTemplateEnabled property
     */
    private Boolean isExternalShareTemplateEnabled;
    /**
     * The isInOrgFormsPhishingScanEnabled property
     */
    private Boolean isInOrgFormsPhishingScanEnabled;
    /**
     * The isRecordIdentityByDefaultEnabled property
     */
    private Boolean isRecordIdentityByDefaultEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new FormsSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FormsSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FormsSettings
     */
    @javax.annotation.Nonnull
    public static FormsSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FormsSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("isBingImageSearchEnabled", (n) -> { this.setIsBingImageSearchEnabled(n.getBooleanValue()); });
        deserializerMap.put("isExternalSendFormEnabled", (n) -> { this.setIsExternalSendFormEnabled(n.getBooleanValue()); });
        deserializerMap.put("isExternalShareCollaborationEnabled", (n) -> { this.setIsExternalShareCollaborationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isExternalShareResultEnabled", (n) -> { this.setIsExternalShareResultEnabled(n.getBooleanValue()); });
        deserializerMap.put("isExternalShareTemplateEnabled", (n) -> { this.setIsExternalShareTemplateEnabled(n.getBooleanValue()); });
        deserializerMap.put("isInOrgFormsPhishingScanEnabled", (n) -> { this.setIsInOrgFormsPhishingScanEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRecordIdentityByDefaultEnabled", (n) -> { this.setIsRecordIdentityByDefaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBingImageSearchEnabled property value. The isBingImageSearchEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBingImageSearchEnabled() {
        return this.isBingImageSearchEnabled;
    }
    /**
     * Gets the isExternalSendFormEnabled property value. The isExternalSendFormEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternalSendFormEnabled() {
        return this.isExternalSendFormEnabled;
    }
    /**
     * Gets the isExternalShareCollaborationEnabled property value. The isExternalShareCollaborationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternalShareCollaborationEnabled() {
        return this.isExternalShareCollaborationEnabled;
    }
    /**
     * Gets the isExternalShareResultEnabled property value. The isExternalShareResultEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternalShareResultEnabled() {
        return this.isExternalShareResultEnabled;
    }
    /**
     * Gets the isExternalShareTemplateEnabled property value. The isExternalShareTemplateEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternalShareTemplateEnabled() {
        return this.isExternalShareTemplateEnabled;
    }
    /**
     * Gets the isInOrgFormsPhishingScanEnabled property value. The isInOrgFormsPhishingScanEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInOrgFormsPhishingScanEnabled() {
        return this.isInOrgFormsPhishingScanEnabled;
    }
    /**
     * Gets the isRecordIdentityByDefaultEnabled property value. The isRecordIdentityByDefaultEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRecordIdentityByDefaultEnabled() {
        return this.isRecordIdentityByDefaultEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isBingImageSearchEnabled", this.getIsBingImageSearchEnabled());
        writer.writeBooleanValue("isExternalSendFormEnabled", this.getIsExternalSendFormEnabled());
        writer.writeBooleanValue("isExternalShareCollaborationEnabled", this.getIsExternalShareCollaborationEnabled());
        writer.writeBooleanValue("isExternalShareResultEnabled", this.getIsExternalShareResultEnabled());
        writer.writeBooleanValue("isExternalShareTemplateEnabled", this.getIsExternalShareTemplateEnabled());
        writer.writeBooleanValue("isInOrgFormsPhishingScanEnabled", this.getIsInOrgFormsPhishingScanEnabled());
        writer.writeBooleanValue("isRecordIdentityByDefaultEnabled", this.getIsRecordIdentityByDefaultEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isBingImageSearchEnabled property value. The isBingImageSearchEnabled property
     * @param value Value to set for the isBingImageSearchEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBingImageSearchEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isBingImageSearchEnabled = value;
    }
    /**
     * Sets the isExternalSendFormEnabled property value. The isExternalSendFormEnabled property
     * @param value Value to set for the isExternalSendFormEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternalSendFormEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isExternalSendFormEnabled = value;
    }
    /**
     * Sets the isExternalShareCollaborationEnabled property value. The isExternalShareCollaborationEnabled property
     * @param value Value to set for the isExternalShareCollaborationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternalShareCollaborationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isExternalShareCollaborationEnabled = value;
    }
    /**
     * Sets the isExternalShareResultEnabled property value. The isExternalShareResultEnabled property
     * @param value Value to set for the isExternalShareResultEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternalShareResultEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isExternalShareResultEnabled = value;
    }
    /**
     * Sets the isExternalShareTemplateEnabled property value. The isExternalShareTemplateEnabled property
     * @param value Value to set for the isExternalShareTemplateEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternalShareTemplateEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isExternalShareTemplateEnabled = value;
    }
    /**
     * Sets the isInOrgFormsPhishingScanEnabled property value. The isInOrgFormsPhishingScanEnabled property
     * @param value Value to set for the isInOrgFormsPhishingScanEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInOrgFormsPhishingScanEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isInOrgFormsPhishingScanEnabled = value;
    }
    /**
     * Sets the isRecordIdentityByDefaultEnabled property value. The isRecordIdentityByDefaultEnabled property
     * @param value Value to set for the isRecordIdentityByDefaultEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRecordIdentityByDefaultEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isRecordIdentityByDefaultEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

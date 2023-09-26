package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FormsSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controls whether users can add images from Bing to forms.
     */
    private Boolean isBingImageSearchEnabled;
    /**
     * Controls whether users can send a link to a form to an external user.
     */
    private Boolean isExternalSendFormEnabled;
    /**
     * Controls whether users can collaborate on a form layout and structure with an external user.
     */
    private Boolean isExternalShareCollaborationEnabled;
    /**
     * Controls whether users can share form results with external users.
     */
    private Boolean isExternalShareResultEnabled;
    /**
     * Controls whether users can share form templates with external users.
     */
    private Boolean isExternalShareTemplateEnabled;
    /**
     * Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     */
    private Boolean isInOrgFormsPhishingScanEnabled;
    /**
     * Controls whether the names of users who fill out forms are recorded.
     */
    private Boolean isRecordIdentityByDefaultEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new FormsSettings and sets the default values.
     */
    public FormsSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FormsSettings
     */
    @jakarta.annotation.Nonnull
    public static FormsSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FormsSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
     * Gets the isBingImageSearchEnabled property value. Controls whether users can add images from Bing to forms.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBingImageSearchEnabled() {
        return this.isBingImageSearchEnabled;
    }
    /**
     * Gets the isExternalSendFormEnabled property value. Controls whether users can send a link to a form to an external user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalSendFormEnabled() {
        return this.isExternalSendFormEnabled;
    }
    /**
     * Gets the isExternalShareCollaborationEnabled property value. Controls whether users can collaborate on a form layout and structure with an external user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalShareCollaborationEnabled() {
        return this.isExternalShareCollaborationEnabled;
    }
    /**
     * Gets the isExternalShareResultEnabled property value. Controls whether users can share form results with external users.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalShareResultEnabled() {
        return this.isExternalShareResultEnabled;
    }
    /**
     * Gets the isExternalShareTemplateEnabled property value. Controls whether users can share form templates with external users.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternalShareTemplateEnabled() {
        return this.isExternalShareTemplateEnabled;
    }
    /**
     * Gets the isInOrgFormsPhishingScanEnabled property value. Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInOrgFormsPhishingScanEnabled() {
        return this.isInOrgFormsPhishingScanEnabled;
    }
    /**
     * Gets the isRecordIdentityByDefaultEnabled property value. Controls whether the names of users who fill out forms are recorded.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecordIdentityByDefaultEnabled() {
        return this.isRecordIdentityByDefaultEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isBingImageSearchEnabled property value. Controls whether users can add images from Bing to forms.
     * @param value Value to set for the isBingImageSearchEnabled property.
     */
    public void setIsBingImageSearchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isBingImageSearchEnabled = value;
    }
    /**
     * Sets the isExternalSendFormEnabled property value. Controls whether users can send a link to a form to an external user.
     * @param value Value to set for the isExternalSendFormEnabled property.
     */
    public void setIsExternalSendFormEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalSendFormEnabled = value;
    }
    /**
     * Sets the isExternalShareCollaborationEnabled property value. Controls whether users can collaborate on a form layout and structure with an external user.
     * @param value Value to set for the isExternalShareCollaborationEnabled property.
     */
    public void setIsExternalShareCollaborationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalShareCollaborationEnabled = value;
    }
    /**
     * Sets the isExternalShareResultEnabled property value. Controls whether users can share form results with external users.
     * @param value Value to set for the isExternalShareResultEnabled property.
     */
    public void setIsExternalShareResultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalShareResultEnabled = value;
    }
    /**
     * Sets the isExternalShareTemplateEnabled property value. Controls whether users can share form templates with external users.
     * @param value Value to set for the isExternalShareTemplateEnabled property.
     */
    public void setIsExternalShareTemplateEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isExternalShareTemplateEnabled = value;
    }
    /**
     * Sets the isInOrgFormsPhishingScanEnabled property value. Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     * @param value Value to set for the isInOrgFormsPhishingScanEnabled property.
     */
    public void setIsInOrgFormsPhishingScanEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isInOrgFormsPhishingScanEnabled = value;
    }
    /**
     * Sets the isRecordIdentityByDefaultEnabled property value. Controls whether the names of users who fill out forms are recorded.
     * @param value Value to set for the isRecordIdentityByDefaultEnabled property.
     */
    public void setIsRecordIdentityByDefaultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isRecordIdentityByDefaultEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

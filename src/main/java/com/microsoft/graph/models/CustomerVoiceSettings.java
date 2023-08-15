package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomerVoiceSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     */
    private Boolean isInOrgFormsPhishingScanEnabled;
    /**
     * Controls whether the names of users who fill out forms are recorded.
     */
    private Boolean isRecordIdentityByDefaultEnabled;
    /**
     * Controls whether only users inside your organization can submit a response.
     */
    private Boolean isRestrictedSurveyAccessEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new customerVoiceSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CustomerVoiceSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customerVoiceSettings
     */
    @jakarta.annotation.Nonnull
    public static CustomerVoiceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerVoiceSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isInOrgFormsPhishingScanEnabled", (n) -> { this.setIsInOrgFormsPhishingScanEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRecordIdentityByDefaultEnabled", (n) -> { this.setIsRecordIdentityByDefaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRestrictedSurveyAccessEnabled", (n) -> { this.setIsRestrictedSurveyAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isInOrgFormsPhishingScanEnabled property value. Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInOrgFormsPhishingScanEnabled() {
        return this.isInOrgFormsPhishingScanEnabled;
    }
    /**
     * Gets the isRecordIdentityByDefaultEnabled property value. Controls whether the names of users who fill out forms are recorded.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecordIdentityByDefaultEnabled() {
        return this.isRecordIdentityByDefaultEnabled;
    }
    /**
     * Gets the isRestrictedSurveyAccessEnabled property value. Controls whether only users inside your organization can submit a response.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRestrictedSurveyAccessEnabled() {
        return this.isRestrictedSurveyAccessEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isInOrgFormsPhishingScanEnabled", this.getIsInOrgFormsPhishingScanEnabled());
        writer.writeBooleanValue("isRecordIdentityByDefaultEnabled", this.getIsRecordIdentityByDefaultEnabled());
        writer.writeBooleanValue("isRestrictedSurveyAccessEnabled", this.getIsRestrictedSurveyAccessEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isInOrgFormsPhishingScanEnabled property value. Controls whether phishing protection is run on forms created by users, blocking the creation of forms if common phishing questions are detected.
     * @param value Value to set for the isInOrgFormsPhishingScanEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsInOrgFormsPhishingScanEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isInOrgFormsPhishingScanEnabled = value;
    }
    /**
     * Sets the isRecordIdentityByDefaultEnabled property value. Controls whether the names of users who fill out forms are recorded.
     * @param value Value to set for the isRecordIdentityByDefaultEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRecordIdentityByDefaultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isRecordIdentityByDefaultEnabled = value;
    }
    /**
     * Sets the isRestrictedSurveyAccessEnabled property value. Controls whether only users inside your organization can submit a response.
     * @param value Value to set for the isRestrictedSurveyAccessEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRestrictedSurveyAccessEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isRestrictedSurveyAccessEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

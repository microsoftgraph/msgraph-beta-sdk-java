package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppsAndServicesSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controls whether users can start trial subscriptions for apps and services in your organization.
     */
    private Boolean isAppAndServicesTrialEnabled;
    /**
     * Controls whether users can access the Microsoft Store.
     */
    private Boolean isOfficeStoreEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new appsAndServicesSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AppsAndServicesSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appsAndServicesSettings
     */
    @jakarta.annotation.Nonnull
    public static AppsAndServicesSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppsAndServicesSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isAppAndServicesTrialEnabled", (n) -> { this.setIsAppAndServicesTrialEnabled(n.getBooleanValue()); });
        deserializerMap.put("isOfficeStoreEnabled", (n) -> { this.setIsOfficeStoreEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAppAndServicesTrialEnabled property value. Controls whether users can start trial subscriptions for apps and services in your organization.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAppAndServicesTrialEnabled() {
        return this.isAppAndServicesTrialEnabled;
    }
    /**
     * Gets the isOfficeStoreEnabled property value. Controls whether users can access the Microsoft Store.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOfficeStoreEnabled() {
        return this.isOfficeStoreEnabled;
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
        writer.writeBooleanValue("isAppAndServicesTrialEnabled", this.getIsAppAndServicesTrialEnabled());
        writer.writeBooleanValue("isOfficeStoreEnabled", this.getIsOfficeStoreEnabled());
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
     * Sets the isAppAndServicesTrialEnabled property value. Controls whether users can start trial subscriptions for apps and services in your organization.
     * @param value Value to set for the isAppAndServicesTrialEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsAppAndServicesTrialEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isAppAndServicesTrialEnabled = value;
    }
    /**
     * Sets the isOfficeStoreEnabled property value. Controls whether users can access the Microsoft Store.
     * @param value Value to set for the isOfficeStoreEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsOfficeStoreEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isOfficeStoreEnabled = value;
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

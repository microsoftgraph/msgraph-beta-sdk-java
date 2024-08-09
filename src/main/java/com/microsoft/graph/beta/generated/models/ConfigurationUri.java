package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationUri implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConfigurationUri} and sets the default values.
     */
    public ConfigurationUri() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationUri}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationUri createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationUri();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appliesToSingleSignOnMode property value. The single sign-on mode that the URI is configured for. Possible values are: saml, password.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppliesToSingleSignOnMode() {
        return this.backingStore.get("appliesToSingleSignOnMode");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the examples property value. The various formats that the URI should follow.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExamples() {
        return this.backingStore.get("examples");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("appliesToSingleSignOnMode", (n) -> { this.setAppliesToSingleSignOnMode(n.getStringValue()); });
        deserializerMap.put("examples", (n) -> { this.setExamples(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(UriUsageType::forValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates whether this URI is required for the single sign-on configuration.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.backingStore.get("isRequired");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the usage property value. The usage property
     * @return a {@link UriUsageType}
     */
    @jakarta.annotation.Nullable
    public UriUsageType getUsage() {
        return this.backingStore.get("usage");
    }
    /**
     * Gets the values property value. The suggested values for the URI. Developers may need to customize these values for their tenant.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appliesToSingleSignOnMode", this.getAppliesToSingleSignOnMode());
        writer.writeCollectionOfPrimitiveValues("examples", this.getExamples());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("usage", this.getUsage());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the appliesToSingleSignOnMode property value. The single sign-on mode that the URI is configured for. Possible values are: saml, password.
     * @param value Value to set for the appliesToSingleSignOnMode property.
     */
    public void setAppliesToSingleSignOnMode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appliesToSingleSignOnMode", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the examples property value. The various formats that the URI should follow.
     * @param value Value to set for the examples property.
     */
    public void setExamples(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("examples", value);
    }
    /**
     * Sets the isRequired property value. Indicates whether this URI is required for the single sign-on configuration.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequired", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final UriUsageType value) {
        this.backingStore.set("usage", value);
    }
    /**
     * Sets the values property value. The suggested values for the URI. Developers may need to customize these values for their tenant.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
}

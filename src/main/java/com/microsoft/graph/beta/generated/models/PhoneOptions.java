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
public class PhoneOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PhoneOptions} and sets the default values.
     */
    public PhoneOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneOptions}
     */
    @jakarta.annotation.Nonnull
    public static PhoneOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneOptions();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the defaultRegions property value. A read-only, Microsoft-defined list of regions that already enable MFA. For more information, see the following list of countries.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getDefaultRegions() {
        return this.backingStore.get("defaultRegions");
    }
    /**
     * Gets the excludeRegions property value. A numbers-only set representing the region telecom codes to prevent or disable the telephony service. Validates against current International Subscriber Dialing (ISD) country codes where the maximum code length is 4. Values must be non-null.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getExcludeRegions() {
        return this.backingStore.get("excludeRegions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultRegions", (n) -> { this.setDefaultRegions(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("excludeRegions", (n) -> { this.setExcludeRegions(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("includeAdditionalRegions", (n) -> { this.setIncludeAdditionalRegions(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeAdditionalRegions property value. A numbers-only set representing the country codes that can be manually added to enable telephony service in those regions, in addition to the list of countries that are already enabled. For more information about regions that require opt in, see Regions that need to opt in for MFA telephony verification. Validates against current International Subscriber Dialing (ISD) country codes where the maximum code length is 4. Values must be positive integers and can&apos;t overlap with &apos;excludeRegions&apos;.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getIncludeAdditionalRegions() {
        return this.backingStore.get("includeAdditionalRegions");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("defaultRegions", this.getDefaultRegions());
        writer.writeCollectionOfPrimitiveValues("excludeRegions", this.getExcludeRegions());
        writer.writeCollectionOfPrimitiveValues("includeAdditionalRegions", this.getIncludeAdditionalRegions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the defaultRegions property value. A read-only, Microsoft-defined list of regions that already enable MFA. For more information, see the following list of countries.
     * @param value Value to set for the defaultRegions property.
     */
    public void setDefaultRegions(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("defaultRegions", value);
    }
    /**
     * Sets the excludeRegions property value. A numbers-only set representing the region telecom codes to prevent or disable the telephony service. Validates against current International Subscriber Dialing (ISD) country codes where the maximum code length is 4. Values must be non-null.
     * @param value Value to set for the excludeRegions property.
     */
    public void setExcludeRegions(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("excludeRegions", value);
    }
    /**
     * Sets the includeAdditionalRegions property value. A numbers-only set representing the country codes that can be manually added to enable telephony service in those regions, in addition to the list of countries that are already enabled. For more information about regions that require opt in, see Regions that need to opt in for MFA telephony verification. Validates against current International Subscriber Dialing (ISD) country codes where the maximum code length is 4. Values must be positive integers and can&apos;t overlap with &apos;excludeRegions&apos;.
     * @param value Value to set for the includeAdditionalRegions property.
     */
    public void setIncludeAdditionalRegions(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("includeAdditionalRegions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

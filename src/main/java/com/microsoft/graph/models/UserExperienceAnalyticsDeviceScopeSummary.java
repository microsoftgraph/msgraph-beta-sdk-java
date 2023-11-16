package com.microsoft.graph.models;

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
/**
 * The user experience analytics tenant level information for all the device scope configurations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceScopeSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceScopeSummary and sets the default values.
     */
    public UserExperienceAnalyticsDeviceScopeSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceScopeSummary
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceScopeSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceScopeSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the completedDeviceScopeIds property value. A collection of the user experience analytics device scope Unique Identifiers that are enabled and finished recalculating the report metric.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCompletedDeviceScopeIds() {
        return this.backingStore.get("completedDeviceScopeIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("completedDeviceScopeIds", (n) -> { this.setCompletedDeviceScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("insufficientDataDeviceScopeIds", (n) -> { this.setInsufficientDataDeviceScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalDeviceScopes", (n) -> { this.setTotalDeviceScopes(n.getIntegerValue()); });
        deserializerMap.put("totalDeviceScopesEnabled", (n) -> { this.setTotalDeviceScopesEnabled(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the insufficientDataDeviceScopeIds property value. A collection of user experience analytics device scope Unique Identitfiers that are enabled but there is insufficient data to calculate results.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInsufficientDataDeviceScopeIds() {
        return this.backingStore.get("insufficientDataDeviceScopeIds");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the totalDeviceScopes property value. The total number of user experience analytics device scopes. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceScopes() {
        return this.backingStore.get("totalDeviceScopes");
    }
    /**
     * Gets the totalDeviceScopesEnabled property value. The total number of user experience analytics device scopes that are enabled. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceScopesEnabled() {
        return this.backingStore.get("totalDeviceScopesEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("completedDeviceScopeIds", this.getCompletedDeviceScopeIds());
        writer.writeCollectionOfPrimitiveValues("insufficientDataDeviceScopeIds", this.getInsufficientDataDeviceScopeIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("totalDeviceScopes", this.getTotalDeviceScopes());
        writer.writeIntegerValue("totalDeviceScopesEnabled", this.getTotalDeviceScopesEnabled());
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
     * Sets the completedDeviceScopeIds property value. A collection of the user experience analytics device scope Unique Identifiers that are enabled and finished recalculating the report metric.
     * @param value Value to set for the completedDeviceScopeIds property.
     */
    public void setCompletedDeviceScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("completedDeviceScopeIds", value);
    }
    /**
     * Sets the insufficientDataDeviceScopeIds property value. A collection of user experience analytics device scope Unique Identitfiers that are enabled but there is insufficient data to calculate results.
     * @param value Value to set for the insufficientDataDeviceScopeIds property.
     */
    public void setInsufficientDataDeviceScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("insufficientDataDeviceScopeIds", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the totalDeviceScopes property value. The total number of user experience analytics device scopes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceScopes property.
     */
    public void setTotalDeviceScopes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalDeviceScopes", value);
    }
    /**
     * Sets the totalDeviceScopesEnabled property value. The total number of user experience analytics device scopes that are enabled. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceScopesEnabled property.
     */
    public void setTotalDeviceScopesEnabled(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalDeviceScopesEnabled", value);
    }
}

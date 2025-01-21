package com.microsoft.graph.beta.models.windowsupdates;

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
public class UpdateManagementEnrollment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UpdateManagementEnrollment} and sets the default values.
     */
    public UpdateManagementEnrollment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateManagementEnrollment}
     */
    @jakarta.annotation.Nonnull
    public static UpdateManagementEnrollment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateManagementEnrollment();
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
     * Gets the driver property value. The driver property
     * @return a {@link UpdateCategoryEnrollmentInformation}
     */
    @jakarta.annotation.Nullable
    public UpdateCategoryEnrollmentInformation getDriver() {
        return this.backingStore.get("driver");
    }
    /**
     * Gets the feature property value. The feature property
     * @return a {@link UpdateCategoryEnrollmentInformation}
     */
    @jakarta.annotation.Nullable
    public UpdateCategoryEnrollmentInformation getFeature() {
        return this.backingStore.get("feature");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("driver", (n) -> { this.setDriver(n.getObjectValue(UpdateCategoryEnrollmentInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getObjectValue(UpdateCategoryEnrollmentInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getObjectValue(UpdateCategoryEnrollmentInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the quality property value. The quality property
     * @return a {@link UpdateCategoryEnrollmentInformation}
     */
    @jakarta.annotation.Nullable
    public UpdateCategoryEnrollmentInformation getQuality() {
        return this.backingStore.get("quality");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("driver", this.getDriver());
        writer.writeObjectValue("feature", this.getFeature());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("quality", this.getQuality());
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
     * Sets the driver property value. The driver property
     * @param value Value to set for the driver property.
     */
    public void setDriver(@jakarta.annotation.Nullable final UpdateCategoryEnrollmentInformation value) {
        this.backingStore.set("driver", value);
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final UpdateCategoryEnrollmentInformation value) {
        this.backingStore.set("feature", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final UpdateCategoryEnrollmentInformation value) {
        this.backingStore.set("quality", value);
    }
}

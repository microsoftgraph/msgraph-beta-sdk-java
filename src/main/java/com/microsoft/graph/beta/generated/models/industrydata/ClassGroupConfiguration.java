package com.microsoft.graph.beta.models.industrydata;

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
public class ClassGroupConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ClassGroupConfiguration} and sets the default values.
     */
    public ClassGroupConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClassGroupConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static ClassGroupConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassGroupConfiguration();
    }
    /**
     * Gets the additionalAttributes property value. The different attributes to sync for the class groups. The possible values are: courseTitle, courseCode, courseSubject, courseGradeLevel, courseExternalId, academicSessionTitle, academicSessionExternalId, classCode, unknownFutureValue.
     * @return a {@link java.util.List<AdditionalClassGroupAttributes>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdditionalClassGroupAttributes> getAdditionalAttributes() {
        return this.backingStore.get("additionalAttributes");
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
     * Gets the additionalOptions property value. The additionalOptions property
     * @return a {@link AdditionalClassGroupOptions}
     */
    @jakarta.annotation.Nullable
    public AdditionalClassGroupOptions getAdditionalOptions() {
        return this.backingStore.get("additionalOptions");
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
     * Gets the enrollmentMappings property value. The enrollmentMappings property
     * @return a {@link EnrollmentMappings}
     */
    @jakarta.annotation.Nullable
    public EnrollmentMappings getEnrollmentMappings() {
        return this.backingStore.get("enrollmentMappings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("additionalAttributes", (n) -> { this.setAdditionalAttributes(n.getCollectionOfEnumValues(AdditionalClassGroupAttributes::forValue)); });
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getObjectValue(AdditionalClassGroupOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("enrollmentMappings", (n) -> { this.setEnrollmentMappings(n.getObjectValue(EnrollmentMappings::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("additionalAttributes", this.getAdditionalAttributes());
        writer.writeObjectValue("additionalOptions", this.getAdditionalOptions());
        writer.writeObjectValue("enrollmentMappings", this.getEnrollmentMappings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalAttributes property value. The different attributes to sync for the class groups. The possible values are: courseTitle, courseCode, courseSubject, courseGradeLevel, courseExternalId, academicSessionTitle, academicSessionExternalId, classCode, unknownFutureValue.
     * @param value Value to set for the additionalAttributes property.
     */
    public void setAdditionalAttributes(@jakarta.annotation.Nullable final java.util.List<AdditionalClassGroupAttributes> value) {
        this.backingStore.set("additionalAttributes", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the additionalOptions property value. The additionalOptions property
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final AdditionalClassGroupOptions value) {
        this.backingStore.set("additionalOptions", value);
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
     * Sets the enrollmentMappings property value. The enrollmentMappings property
     * @param value Value to set for the enrollmentMappings property.
     */
    public void setEnrollmentMappings(@jakarta.annotation.Nullable final EnrollmentMappings value) {
        this.backingStore.set("enrollmentMappings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

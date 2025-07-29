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
public class AdditionalUserOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AdditionalUserOptions} and sets the default values.
     */
    public AdditionalUserOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdditionalUserOptions}
     */
    @jakarta.annotation.Nonnull
    public static AdditionalUserOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdditionalUserOptions();
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
     * Gets the allowStudentContactAssociation property value. Indicates whether student contact association should be allowed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowStudentContactAssociation() {
        return this.backingStore.get("allowStudentContactAssociation");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowStudentContactAssociation", (n) -> { this.setAllowStudentContactAssociation(n.getBooleanValue()); });
        deserializerMap.put("markAllStudentsAsMinors", (n) -> { this.setMarkAllStudentsAsMinors(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("studentAgeGroup", (n) -> { this.setStudentAgeGroup(n.getEnumValue(StudentAgeGroup::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the markAllStudentsAsMinors property value. Indicates whether all students should be marked as minors. The markAllStudentsAsMinors property is deprecated and will stop returning data on October 15, 2025. Going forward, use the studentAgeGroup property.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMarkAllStudentsAsMinors() {
        return this.backingStore.get("markAllStudentsAsMinors");
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
     * Gets the studentAgeGroup property value. Indicates the age group classification for students. Possible values are: minor, notAdult, adult, unknownFutureValue. Use null to disable age group enforcement.
     * @return a {@link StudentAgeGroup}
     */
    @jakarta.annotation.Nullable
    public StudentAgeGroup getStudentAgeGroup() {
        return this.backingStore.get("studentAgeGroup");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowStudentContactAssociation", this.getAllowStudentContactAssociation());
        writer.writeBooleanValue("markAllStudentsAsMinors", this.getMarkAllStudentsAsMinors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("studentAgeGroup", this.getStudentAgeGroup());
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
     * Sets the allowStudentContactAssociation property value. Indicates whether student contact association should be allowed.
     * @param value Value to set for the allowStudentContactAssociation property.
     */
    public void setAllowStudentContactAssociation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowStudentContactAssociation", value);
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
     * Sets the markAllStudentsAsMinors property value. Indicates whether all students should be marked as minors. The markAllStudentsAsMinors property is deprecated and will stop returning data on October 15, 2025. Going forward, use the studentAgeGroup property.
     * @param value Value to set for the markAllStudentsAsMinors property.
     */
    public void setMarkAllStudentsAsMinors(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("markAllStudentsAsMinors", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the studentAgeGroup property value. Indicates the age group classification for students. Possible values are: minor, notAdult, adult, unknownFutureValue. Use null to disable age group enforcement.
     * @param value Value to set for the studentAgeGroup property.
     */
    public void setStudentAgeGroup(@jakarta.annotation.Nullable final StudentAgeGroup value) {
        this.backingStore.set("studentAgeGroup", value);
    }
}

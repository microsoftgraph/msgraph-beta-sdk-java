package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureADDevice extends UpdatableAsset implements Parsable {
    /**
     * Instantiates a new {@link AzureADDevice} and sets the default values.
     */
    public AzureADDevice() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.azureADDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureADDevice}
     */
    @jakarta.annotation.Nonnull
    public static AzureADDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADDevice();
    }
    /**
     * Gets the enrollments property value. Specifies areas in which the device is enrolled. Read-only. Returned by default.
     * @return a {@link java.util.List<UpdatableAssetEnrollment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAssetEnrollment> getEnrollments() {
        return this.backingStore.get("enrollments");
    }
    /**
     * Gets the errors property value. Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.
     * @return a {@link java.util.List<UpdatableAssetError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAssetError> getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrollments", (n) -> { this.setEnrollments(n.getCollectionOfObjectValues(UpdatableAssetEnrollment::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(UpdatableAssetError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("enrollments", this.getEnrollments());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
    }
    /**
     * Sets the enrollments property value. Specifies areas in which the device is enrolled. Read-only. Returned by default.
     * @param value Value to set for the enrollments property.
     */
    public void setEnrollments(@jakarta.annotation.Nullable final java.util.List<UpdatableAssetEnrollment> value) {
        this.backingStore.set("enrollments", value);
    }
    /**
     * Sets the errors property value. Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<UpdatableAssetError> value) {
        this.backingStore.set("errors", value);
    }
}

package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureADDevice extends UpdatableAsset implements Parsable {
    /**
     * Specifies areas of the service in which the device is enrolled. Read-only. Returned by default.
     */
    private java.util.List<UpdatableAssetEnrollment> enrollments;
    /**
     * Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.
     */
    private java.util.List<UpdatableAssetError> errors;
    /**
     * Instantiates a new AzureADDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AzureADDevice() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.azureADDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureADDevice
     */
    @javax.annotation.Nonnull
    public static AzureADDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADDevice();
    }
    /**
     * Gets the enrollments property value. Specifies areas of the service in which the device is enrolled. Read-only. Returned by default.
     * @return a updatableAssetEnrollment
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAssetEnrollment> getEnrollments() {
        return this.enrollments;
    }
    /**
     * Gets the errors property value. Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.
     * @return a updatableAssetError
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAssetError> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrollments", (n) -> { this.setEnrollments(n.getCollectionOfObjectValues(UpdatableAssetEnrollment::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(UpdatableAssetError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("enrollments", this.getEnrollments());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
    }
    /**
     * Sets the enrollments property value. Specifies areas of the service in which the device is enrolled. Read-only. Returned by default.
     * @param value Value to set for the enrollments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollments(@javax.annotation.Nullable final java.util.List<UpdatableAssetEnrollment> value) {
        this.enrollments = value;
    }
    /**
     * Sets the errors property value. Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<UpdatableAssetError> value) {
        this.errors = value;
    }
}

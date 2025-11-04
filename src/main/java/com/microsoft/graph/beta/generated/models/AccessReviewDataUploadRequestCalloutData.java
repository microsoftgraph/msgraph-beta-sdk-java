package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewDataUploadRequestCalloutData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewDataUploadRequestCalloutData} and sets the default values.
     */
    public AccessReviewDataUploadRequestCalloutData() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewDataUploadRequestCalloutData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewDataUploadRequestCalloutData}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewDataUploadRequestCalloutData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewDataUploadRequestCalloutData();
    }
    /**
     * Gets the accessReviewInstance property value. The accessReviewInstance property
     * @return a {@link AccessReviewInstance}
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstance getAccessReviewInstance() {
        return this.backingStore.get("accessReviewInstance");
    }
    /**
     * Gets the callbackDataType property value. The callbackDataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallbackDataType() {
        return this.backingStore.get("callbackDataType");
    }
    /**
     * Gets the catalog property value. The catalog property
     * @return a {@link AccessPackageCatalog}
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.backingStore.get("catalog");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessReviewInstance", (n) -> { this.setAccessReviewInstance(n.getObjectValue(AccessReviewInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("callbackDataType", (n) -> { this.setCallbackDataType(n.getStringValue()); });
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a {@link AccessPackageResource}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessReviewInstance", this.getAccessReviewInstance());
        writer.writeStringValue("callbackDataType", this.getCallbackDataType());
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the accessReviewInstance property value. The accessReviewInstance property
     * @param value Value to set for the accessReviewInstance property.
     */
    public void setAccessReviewInstance(@jakarta.annotation.Nullable final AccessReviewInstance value) {
        this.backingStore.set("accessReviewInstance", value);
    }
    /**
     * Sets the callbackDataType property value. The callbackDataType property
     * @param value Value to set for the callbackDataType property.
     */
    public void setCallbackDataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callbackDataType", value);
    }
    /**
     * Sets the catalog property value. The catalog property
     * @param value Value to set for the catalog property.
     */
    public void setCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.backingStore.set("catalog", value);
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.backingStore.set("resource", value);
    }
}

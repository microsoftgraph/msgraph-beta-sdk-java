package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewResourceDataUploadSessionContextData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewResourceDataUploadSessionContextData} and sets the default values.
     */
    public AccessReviewResourceDataUploadSessionContextData() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewResourceDataUploadSessionContextData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewResourceDataUploadSessionContextData}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewResourceDataUploadSessionContextData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewResourceDataUploadSessionContextData();
    }
    /**
     * Gets the accessReviewId property value. The access review definition id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessReviewId() {
        return this.backingStore.get("accessReviewId");
    }
    /**
     * Gets the accessReviewInstanceId property value. The access review instance id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessReviewInstanceId() {
        return this.backingStore.get("accessReviewInstanceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessReviewId", (n) -> { this.setAccessReviewId(n.getStringValue()); });
        deserializerMap.put("accessReviewInstanceId", (n) -> { this.setAccessReviewInstanceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessReviewId", this.getAccessReviewId());
        writer.writeStringValue("accessReviewInstanceId", this.getAccessReviewInstanceId());
    }
    /**
     * Sets the accessReviewId property value. The access review definition id.
     * @param value Value to set for the accessReviewId property.
     */
    public void setAccessReviewId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessReviewId", value);
    }
    /**
     * Sets the accessReviewInstanceId property value. The access review instance id.
     * @param value Value to set for the accessReviewInstanceId property.
     */
    public void setAccessReviewInstanceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessReviewInstanceId", value);
    }
}

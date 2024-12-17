package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceHostedMediaConfig extends MediaConfig implements Parsable {
    /**
     * Instantiates a new {@link ServiceHostedMediaConfig} and sets the default values.
     */
    public ServiceHostedMediaConfig() {
        super();
        this.setOdataType("#microsoft.graph.serviceHostedMediaConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceHostedMediaConfig}
     */
    @jakarta.annotation.Nonnull
    public static ServiceHostedMediaConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHostedMediaConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("liveCaptionOptions", (n) -> { this.setLiveCaptionOptions(n.getObjectValue(LiveCaptionOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("preFetchMedia", (n) -> { this.setPreFetchMedia(n.getCollectionOfObjectValues(MediaInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the liveCaptionOptions property value. The liveCaptionOptions property
     * @return a {@link LiveCaptionOptions}
     */
    @jakarta.annotation.Nullable
    public LiveCaptionOptions getLiveCaptionOptions() {
        return this.backingStore.get("liveCaptionOptions");
    }
    /**
     * Gets the preFetchMedia property value. The list of media to prefetch.
     * @return a {@link java.util.List<MediaInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaInfo> getPreFetchMedia() {
        return this.backingStore.get("preFetchMedia");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("liveCaptionOptions", this.getLiveCaptionOptions());
        writer.writeCollectionOfObjectValues("preFetchMedia", this.getPreFetchMedia());
    }
    /**
     * Sets the liveCaptionOptions property value. The liveCaptionOptions property
     * @param value Value to set for the liveCaptionOptions property.
     */
    public void setLiveCaptionOptions(@jakarta.annotation.Nullable final LiveCaptionOptions value) {
        this.backingStore.set("liveCaptionOptions", value);
    }
    /**
     * Sets the preFetchMedia property value. The list of media to prefetch.
     * @param value Value to set for the preFetchMedia property.
     */
    public void setPreFetchMedia(@jakarta.annotation.Nullable final java.util.List<MediaInfo> value) {
        this.backingStore.set("preFetchMedia", value);
    }
}

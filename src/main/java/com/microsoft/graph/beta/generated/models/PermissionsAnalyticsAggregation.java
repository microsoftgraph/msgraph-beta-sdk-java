package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsAnalyticsAggregation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PermissionsAnalyticsAggregation} and sets the default values.
     */
    public PermissionsAnalyticsAggregation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PermissionsAnalyticsAggregation}
     */
    @jakarta.annotation.Nonnull
    public static PermissionsAnalyticsAggregation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsAnalyticsAggregation();
    }
    /**
     * Gets the aws property value. The aws property
     * @return a {@link PermissionsAnalytics}
     */
    @jakarta.annotation.Nullable
    public PermissionsAnalytics getAws() {
        return this.backingStore.get("aws");
    }
    /**
     * Gets the azure property value. The azure property
     * @return a {@link PermissionsAnalytics}
     */
    @jakarta.annotation.Nullable
    public PermissionsAnalytics getAzure() {
        return this.backingStore.get("azure");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aws", (n) -> { this.setAws(n.getObjectValue(PermissionsAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("azure", (n) -> { this.setAzure(n.getObjectValue(PermissionsAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("gcp", (n) -> { this.setGcp(n.getObjectValue(PermissionsAnalytics::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gcp property value. The gcp property
     * @return a {@link PermissionsAnalytics}
     */
    @jakarta.annotation.Nullable
    public PermissionsAnalytics getGcp() {
        return this.backingStore.get("gcp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("aws", this.getAws());
        writer.writeObjectValue("azure", this.getAzure());
        writer.writeObjectValue("gcp", this.getGcp());
    }
    /**
     * Sets the aws property value. The aws property
     * @param value Value to set for the aws property.
     */
    public void setAws(@jakarta.annotation.Nullable final PermissionsAnalytics value) {
        this.backingStore.set("aws", value);
    }
    /**
     * Sets the azure property value. The azure property
     * @param value Value to set for the azure property.
     */
    public void setAzure(@jakarta.annotation.Nullable final PermissionsAnalytics value) {
        this.backingStore.set("azure", value);
    }
    /**
     * Sets the gcp property value. The gcp property
     * @param value Value to set for the gcp property.
     */
    public void setGcp(@jakarta.annotation.Nullable final PermissionsAnalytics value) {
        this.backingStore.set("gcp", value);
    }
}

package com.microsoft.graph.beta.security.contentmanagement.repositories.microsoftgraphsecuritycontentmanagementdiscoveravailablerepositories;

import com.microsoft.graph.beta.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.beta.models.security.contentmanagement.DiscoveredRepository;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscoverAvailableRepositoriesPostResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link DiscoverAvailableRepositoriesPostResponse} and sets the default values.
     */
    public DiscoverAvailableRepositoriesPostResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscoverAvailableRepositoriesPostResponse}
     */
    @jakarta.annotation.Nonnull
    public static DiscoverAvailableRepositoriesPostResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscoverAvailableRepositoriesPostResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(DiscoveredRepository::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<DiscoveredRepository>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredRepository> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<DiscoveredRepository> value) {
        this.backingStore.set("value", value);
    }
}

package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeatureUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * Instantiates a new {@link FeatureUpdateCatalogEntry} and sets the default values.
     */
    public FeatureUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.featureUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeatureUpdateCatalogEntry}
     */
    @jakarta.annotation.Nonnull
    public static FeatureUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureUpdateCatalogEntry();
    }
    /**
     * Gets the buildNumber property value. The build number of the feature update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuildNumber() {
        return this.backingStore.get("buildNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the version property value. The version of the feature update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the buildNumber property value. The build number of the feature update. Read-only.
     * @param value Value to set for the buildNumber property.
     */
    public void setBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("buildNumber", value);
    }
    /**
     * Sets the version property value. The version of the feature update. Read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}

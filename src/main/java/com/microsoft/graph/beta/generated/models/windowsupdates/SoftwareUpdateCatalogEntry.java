package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SoftwareUpdateCatalogEntry extends CatalogEntry implements Parsable {
    /**
     * Instantiates a new {@link SoftwareUpdateCatalogEntry} and sets the default values.
     */
    public SoftwareUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SoftwareUpdateCatalogEntry}
     */
    @jakarta.annotation.Nonnull
    public static SoftwareUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.driverUpdateCatalogEntry": return new DriverUpdateCatalogEntry();
                case "#microsoft.graph.windowsUpdates.featureUpdateCatalogEntry": return new FeatureUpdateCatalogEntry();
                case "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry": return new QualityUpdateCatalogEntry();
            }
        }
        return new SoftwareUpdateCatalogEntry();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}

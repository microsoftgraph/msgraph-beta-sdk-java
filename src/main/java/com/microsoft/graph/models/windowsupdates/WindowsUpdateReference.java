package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.windowsupdates.ExpeditedQualityUpdateReference;
import com.microsoft.graph.models.windowsupdates.FeatureUpdateReference;
import com.microsoft.graph.models.windowsupdates.QualityUpdateReference;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateReference extends SoftwareUpdateReference implements Parsable {
    /**
     * Instantiates a new WindowsUpdateReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsUpdateReference() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.windowsUpdateReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateReference
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.expeditedQualityUpdateReference": return new ExpeditedQualityUpdateReference();
                case "#microsoft.graph.windowsUpdates.featureUpdateReference": return new FeatureUpdateReference();
                case "#microsoft.graph.windowsUpdates.qualityUpdateReference": return new QualityUpdateReference();
            }
        }
        return new WindowsUpdateReference();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsUpdateReference currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap
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
    }
}

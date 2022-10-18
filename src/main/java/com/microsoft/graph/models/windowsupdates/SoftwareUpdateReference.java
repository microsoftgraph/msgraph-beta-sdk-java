package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.windowsupdates.ExpeditedQualityUpdateReference;
import com.microsoft.graph.models.windowsupdates.FeatureUpdateReference;
import com.microsoft.graph.models.windowsupdates.QualityUpdateReference;
import com.microsoft.graph.models.windowsupdates.WindowsUpdateReference;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SoftwareUpdateReference extends DeployableContent implements Parsable {
    /**
     * Instantiates a new SoftwareUpdateReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SoftwareUpdateReference() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.softwareUpdateReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SoftwareUpdateReference
     */
    @javax.annotation.Nonnull
    public static SoftwareUpdateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.expeditedQualityUpdateReference": return new ExpeditedQualityUpdateReference();
                case "#microsoft.graph.windowsUpdates.featureUpdateReference": return new FeatureUpdateReference();
                case "#microsoft.graph.windowsUpdates.qualityUpdateReference": return new QualityUpdateReference();
                case "#microsoft.graph.windowsUpdates.windowsUpdateReference": return new WindowsUpdateReference();
            }
        }
        return new SoftwareUpdateReference();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SoftwareUpdateReference currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
        }};
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

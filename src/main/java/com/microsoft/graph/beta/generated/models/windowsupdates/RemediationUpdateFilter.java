package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemediationUpdateFilter extends WindowsUpdateFilter implements Parsable {
    /**
     * Instantiates a new {@link RemediationUpdateFilter} and sets the default values.
     */
    public RemediationUpdateFilter() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.remediationUpdateFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemediationUpdateFilter}
     */
    @jakarta.annotation.Nonnull
    public static RemediationUpdateFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemediationUpdateFilter();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("remediationType", (n) -> { this.setRemediationType(n.getEnumValue(RemediationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the remediationType property value. The remediationType property
     * @return a {@link RemediationType}
     */
    @jakarta.annotation.Nullable
    public RemediationType getRemediationType() {
        return this.backingStore.get("remediationType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("remediationType", this.getRemediationType());
    }
    /**
     * Sets the remediationType property value. The remediationType property
     * @param value Value to set for the remediationType property.
     */
    public void setRemediationType(@jakarta.annotation.Nullable final RemediationType value) {
        this.backingStore.set("remediationType", value);
    }
}

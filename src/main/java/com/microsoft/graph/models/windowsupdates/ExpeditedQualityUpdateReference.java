package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExpeditedQualityUpdateReference extends QualityUpdateReference implements Parsable {
    /** Specifies other content to consider as equivalent. Supports a subset of the values for equivalentContentOption. Default value is latestSecurity. Possible values are: latestSecurity, unknownFutureValue. */
    private EquivalentContentOption _equivalentContent;
    /**
     * Instantiates a new ExpeditedQualityUpdateReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExpeditedQualityUpdateReference() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.expeditedQualityUpdateReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExpeditedQualityUpdateReference
     */
    @javax.annotation.Nonnull
    public static ExpeditedQualityUpdateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpeditedQualityUpdateReference();
    }
    /**
     * Gets the equivalentContent property value. Specifies other content to consider as equivalent. Supports a subset of the values for equivalentContentOption. Default value is latestSecurity. Possible values are: latestSecurity, unknownFutureValue.
     * @return a equivalentContentOption
     */
    @javax.annotation.Nullable
    public EquivalentContentOption getEquivalentContent() {
        return this._equivalentContent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("equivalentContent", (n) -> { this.setEquivalentContent(n.getEnumValue(EquivalentContentOption.class)); });
        return deserializerMap;
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
        writer.writeEnumValue("equivalentContent", this.getEquivalentContent());
    }
    /**
     * Sets the equivalentContent property value. Specifies other content to consider as equivalent. Supports a subset of the values for equivalentContentOption. Default value is latestSecurity. Possible values are: latestSecurity, unknownFutureValue.
     * @param value Value to set for the equivalentContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEquivalentContent(@javax.annotation.Nullable final EquivalentContentOption value) {
        this._equivalentContent = value;
    }
}

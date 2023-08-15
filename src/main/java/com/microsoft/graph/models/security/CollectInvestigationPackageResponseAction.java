package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CollectInvestigationPackageResponseAction extends ResponseAction implements Parsable {
    /**
     * The identifier property
     */
    private DeviceIdEntityIdentifier identifier;
    /**
     * Instantiates a new collectInvestigationPackageResponseAction and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CollectInvestigationPackageResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.collectInvestigationPackageResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a collectInvestigationPackageResponseAction
     */
    @jakarta.annotation.Nonnull
    public static CollectInvestigationPackageResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CollectInvestigationPackageResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumValue(DeviceIdEntityIdentifier.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a deviceIdEntityIdentifier
     */
    @jakarta.annotation.Nullable
    public DeviceIdEntityIdentifier getIdentifier() {
        return this.identifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIdentifier(@jakarta.annotation.Nullable final DeviceIdEntityIdentifier value) {
        this.identifier = value;
    }
}

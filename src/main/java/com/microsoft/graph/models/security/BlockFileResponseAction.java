package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BlockFileResponseAction extends ResponseAction implements Parsable {
    /**
     * The deviceGroupNames property
     */
    private java.util.List<String> deviceGroupNames;
    /**
     * The identifier property
     */
    private FileEntityIdentifier identifier;
    /**
     * Instantiates a new blockFileResponseAction and sets the default values.
     */
    public BlockFileResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.blockFileResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a blockFileResponseAction
     */
    @jakarta.annotation.Nonnull
    public static BlockFileResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockFileResponseAction();
    }
    /**
     * Gets the deviceGroupNames property value. The deviceGroupNames property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeviceGroupNames() {
        return this.deviceGroupNames;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceGroupNames", (n) -> { this.setDeviceGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getEnumValue(FileEntityIdentifier.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a fileEntityIdentifier
     */
    @jakarta.annotation.Nullable
    public FileEntityIdentifier getIdentifier() {
        return this.identifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("deviceGroupNames", this.getDeviceGroupNames());
        writer.writeEnumValue("identifier", this.getIdentifier());
    }
    /**
     * Sets the deviceGroupNames property value. The deviceGroupNames property
     * @param value Value to set for the deviceGroupNames property.
     */
    public void setDeviceGroupNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.deviceGroupNames = value;
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final FileEntityIdentifier value) {
        this.identifier = value;
    }
}

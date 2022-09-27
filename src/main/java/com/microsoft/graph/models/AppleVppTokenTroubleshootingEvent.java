package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleVppTokenTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /** Apple Volume Purchase Program Token Identifier. */
    private String _tokenId;
    /**
     * Instantiates a new AppleVppTokenTroubleshootingEvent and sets the default values.
     * @return a void
     */
    public AppleVppTokenTroubleshootingEvent() {
        super();
        this.setOdataType("#microsoft.graph.appleVppTokenTroubleshootingEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleVppTokenTroubleshootingEvent
     */
    @javax.annotation.Nonnull
    public static AppleVppTokenTroubleshootingEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleVppTokenTroubleshootingEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleVppTokenTroubleshootingEvent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("tokenId", (n) -> { currentObject.setTokenId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the tokenId property value. Apple Volume Purchase Program Token Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenId() {
        return this._tokenId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("tokenId", this.getTokenId());
    }
    /**
     * Sets the tokenId property value. Apple Volume Purchase Program Token Identifier.
     * @param value Value to set for the tokenId property.
     * @return a void
     */
    public void setTokenId(@javax.annotation.Nullable final String value) {
        this._tokenId = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeletedTeam extends Entity implements Parsable {
    /** The channels those are either shared with this deleted team or created in this deleted team. */
    private java.util.List<Channel> _channels;
    /**
     * Instantiates a new DeletedTeam and sets the default values.
     * @return a void
     */
    public DeletedTeam() {
        super();
        this.setOdataType("#microsoft.graph.deletedTeam");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeletedTeam
     */
    @javax.annotation.Nonnull
    public static DeletedTeam createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletedTeam();
    }
    /**
     * Gets the channels property value. The channels those are either shared with this deleted team or created in this deleted team.
     * @return a channel
     */
    @javax.annotation.Nullable
    public java.util.List<Channel> getChannels() {
        return this._channels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeletedTeam currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("channels", (n) -> { currentObject.setChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("channels", this.getChannels());
    }
    /**
     * Sets the channels property value. The channels those are either shared with this deleted team or created in this deleted team.
     * @param value Value to set for the channels property.
     * @return a void
     */
    public void setChannels(@javax.annotation.Nullable final java.util.List<Channel> value) {
        this._channels = value;
    }
}

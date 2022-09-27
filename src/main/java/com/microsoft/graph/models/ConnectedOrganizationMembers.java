package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectedOrganizationMembers extends UserSet implements Parsable {
    /** The name of the connected organization. Read only. */
    private String _description;
    /** The ID of the connected organization in entitlement management. */
    private String _id;
    /**
     * Instantiates a new ConnectedOrganizationMembers and sets the default values.
     * @return a void
     */
    public ConnectedOrganizationMembers() {
        super();
        this.setOdataType("#microsoft.graph.connectedOrganizationMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectedOrganizationMembers
     */
    @javax.annotation.Nonnull
    public static ConnectedOrganizationMembers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectedOrganizationMembers();
    }
    /**
     * Gets the description property value. The name of the connected organization. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConnectedOrganizationMembers currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The ID of the connected organization in entitlement management.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
    }
    /**
     * Sets the description property value. The name of the connected organization. Read only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the id property value. The ID of the connected organization in entitlement management.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
}

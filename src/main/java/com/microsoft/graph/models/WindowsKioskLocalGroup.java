package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskLocalGroup extends WindowsKioskUser implements Parsable {
    /** The name of the local group that will be locked to this kiosk configuration */
    private String _groupName;
    /**
     * Instantiates a new WindowsKioskLocalGroup and sets the default values.
     * @return a void
     */
    public WindowsKioskLocalGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskLocalGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskLocalGroup
     */
    @javax.annotation.Nonnull
    public static WindowsKioskLocalGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskLocalGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskLocalGroup currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("groupName", (n) -> { currentObject.setGroupName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupName() {
        return this._groupName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupName", this.getGroupName());
    }
    /**
     * Sets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @param value Value to set for the groupName property.
     * @return a void
     */
    public void setGroupName(@javax.annotation.Nullable final String value) {
        this._groupName = value;
    }
}

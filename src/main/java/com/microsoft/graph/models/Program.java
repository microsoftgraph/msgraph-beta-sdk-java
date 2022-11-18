package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Program extends Entity implements Parsable {
    /** Controls associated with the program. */
    private java.util.List<ProgramControl> _controls;
    /** The description of the program. */
    private String _description;
    /** The name of the program.  Required on create. */
    private String _displayName;
    /**
     * Instantiates a new Program and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Program() {
        super();
        this.setOdataType("#microsoft.graph.program");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Program
     */
    @javax.annotation.Nonnull
    public static Program createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Program();
    }
    /**
     * Gets the controls property value. Controls associated with the program.
     * @return a programControl
     */
    @javax.annotation.Nullable
    public java.util.List<ProgramControl> getControls() {
        return this._controls;
    }
    /**
     * Gets the description property value. The description of the program.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the program.  Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Program currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("controls", (n) -> { currentObject.setControls(n.getCollectionOfObjectValues(ProgramControl::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
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
        writer.writeCollectionOfObjectValues("controls", this.getControls());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the controls property value. Controls associated with the program.
     * @param value Value to set for the controls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControls(@javax.annotation.Nullable final java.util.List<ProgramControl> value) {
        this._controls = value;
    }
    /**
     * Sets the description property value. The description of the program.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the program.  Required on create.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}

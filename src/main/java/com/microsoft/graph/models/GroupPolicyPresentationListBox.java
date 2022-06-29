package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationListBox extends GroupPolicyPresentation implements Parsable {
    /** If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false. */
    private Boolean _explicitValue;
    /** Not yet documented */
    private String _valuePrefix;
    /**
     * Instantiates a new GroupPolicyPresentationListBox and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentationListBox() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationListBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationListBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationListBox();
    }
    /**
     * Gets the explicitValue property value. If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExplicitValue() {
        return this._explicitValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationListBox currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("explicitValue", (n) -> { currentObject.setExplicitValue(n.getBooleanValue()); });
            this.put("valuePrefix", (n) -> { currentObject.setValuePrefix(n.getStringValue()); });
        }};
    }
    /**
     * Gets the valuePrefix property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValuePrefix() {
        return this._valuePrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("explicitValue", this.getExplicitValue());
        writer.writeStringValue("valuePrefix", this.getValuePrefix());
    }
    /**
     * Sets the explicitValue property value. If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.
     * @param value Value to set for the explicitValue property.
     * @return a void
     */
    public void setExplicitValue(@javax.annotation.Nullable final Boolean value) {
        this._explicitValue = value;
    }
    /**
     * Sets the valuePrefix property value. Not yet documented
     * @param value Value to set for the valuePrefix property.
     * @return a void
     */
    public void setValuePrefix(@javax.annotation.Nullable final String value) {
        this._valuePrefix = value;
    }
}

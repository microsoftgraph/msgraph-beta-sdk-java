package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantContactInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The email address for the contact. Optional  */
    private String _email;
    /** The name for the contact. Required.  */
    private String _name;
    /** The notes associated with the contact. Optional  */
    private String _notes;
    /** The phone number for the contact. Optional.  */
    private String _phone;
    /** The title for the contact. Required.  */
    private String _title;
    /**
     * Instantiates a new tenantContactInformation and sets the default values.
     * @return a void
     */
    public TenantContactInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantContactInformation
     */
    @javax.annotation.Nonnull
    public static TenantContactInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantContactInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the email property value. The email address for the contact. Optional
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantContactInformation currentObject = this;
        return new HashMap<>(5) {{
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("phone", (n) -> { currentObject.setPhone(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The name for the contact. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the notes property value. The notes associated with the contact. Optional
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the phone property value. The phone number for the contact. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this._phone;
    }
    /**
     * Gets the title property value. The title for the contact. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the email property value. The email address for the contact. Optional
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the name property value. The name for the contact. Required.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the notes property value. The notes associated with the contact. Optional
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the phone property value. The phone number for the contact. Optional.
     * @param value Value to set for the phone property.
     * @return a void
     */
    public void setPhone(@javax.annotation.Nullable final String value) {
        this._phone = value;
    }
    /**
     * Sets the title property value. The title for the contact. Required.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}

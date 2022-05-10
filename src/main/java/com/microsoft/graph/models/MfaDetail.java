package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MfaDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the MFA auth detail for the corresponding Sign-in activity when the MFA Required is 'Yes'. */
    private String _authDetail;
    /** Indicates the MFA Auth methods (SMS, Phone, Authenticator App are some of the value) for the corresponding sign-in activity when the MFA Required field is 'Yes'. */
    private String _authMethod;
    /**
     * Instantiates a new mfaDetail and sets the default values.
     * @return a void
     */
    public MfaDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mfaDetail
     */
    @javax.annotation.Nonnull
    public static MfaDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaDetail();
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
     * Gets the authDetail property value. Indicates the MFA auth detail for the corresponding Sign-in activity when the MFA Required is 'Yes'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthDetail() {
        return this._authDetail;
    }
    /**
     * Gets the authMethod property value. Indicates the MFA Auth methods (SMS, Phone, Authenticator App are some of the value) for the corresponding sign-in activity when the MFA Required field is 'Yes'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthMethod() {
        return this._authMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MfaDetail currentObject = this;
        return new HashMap<>(2) {{
            this.put("authDetail", (n) -> { currentObject.setAuthDetail(n.getStringValue()); });
            this.put("authMethod", (n) -> { currentObject.setAuthMethod(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authDetail", this.getAuthDetail());
        writer.writeStringValue("authMethod", this.getAuthMethod());
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
     * Sets the authDetail property value. Indicates the MFA auth detail for the corresponding Sign-in activity when the MFA Required is 'Yes'.
     * @param value Value to set for the authDetail property.
     * @return a void
     */
    public void setAuthDetail(@javax.annotation.Nullable final String value) {
        this._authDetail = value;
    }
    /**
     * Sets the authMethod property value. Indicates the MFA Auth methods (SMS, Phone, Authenticator App are some of the value) for the corresponding sign-in activity when the MFA Required field is 'Yes'.
     * @param value Value to set for the authMethod property.
     * @return a void
     */
    public void setAuthMethod(@javax.annotation.Nullable final String value) {
        this._authMethod = value;
    }
}

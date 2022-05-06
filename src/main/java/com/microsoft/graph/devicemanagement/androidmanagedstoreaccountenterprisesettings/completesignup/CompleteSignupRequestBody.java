package microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.completesignup;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the completeSignup method.  */
public class CompleteSignupRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The enterpriseToken property  */
    private String _enterpriseToken;
    /**
     * Instantiates a new completeSignupRequestBody and sets the default values.
     * @return a void
     */
    public CompleteSignupRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a completeSignupRequestBody
     */
    @javax.annotation.Nonnull
    public static CompleteSignupRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompleteSignupRequestBody();
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
     * Gets the enterpriseToken property value. The enterpriseToken property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseToken() {
        return this._enterpriseToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CompleteSignupRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("enterpriseToken", (n) -> { currentObject.setEnterpriseToken(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("enterpriseToken", this.getEnterpriseToken());
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
     * Sets the enterpriseToken property value. The enterpriseToken property
     * @param value Value to set for the enterpriseToken property.
     * @return a void
     */
    public void setEnterpriseToken(@javax.annotation.Nullable final String value) {
        this._enterpriseToken = value;
    }
}

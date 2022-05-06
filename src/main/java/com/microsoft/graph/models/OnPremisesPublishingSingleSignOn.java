package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishingSingleSignOn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.  */
    private KerberosSignOnSettings _kerberosSignOnSettings;
    /** The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased.  */
    private SingleSignOnMode _singleSignOnMode;
    /**
     * Instantiates a new onPremisesPublishingSingleSignOn and sets the default values.
     * @return a void
     */
    public OnPremisesPublishingSingleSignOn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesPublishingSingleSignOn
     */
    @javax.annotation.Nonnull
    public static OnPremisesPublishingSingleSignOn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishingSingleSignOn();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesPublishingSingleSignOn currentObject = this;
        return new HashMap<>(2) {{
            this.put("kerberosSignOnSettings", (n) -> { currentObject.setKerberosSignOnSettings(n.getObjectValue(KerberosSignOnSettings::createFromDiscriminatorValue)); });
            this.put("singleSignOnMode", (n) -> { currentObject.setSingleSignOnMode(n.getEnumValue(SingleSignOnMode.class)); });
        }};
    }
    /**
     * Gets the kerberosSignOnSettings property value. The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.
     * @return a kerberosSignOnSettings
     */
    @javax.annotation.Nullable
    public KerberosSignOnSettings getKerberosSignOnSettings() {
        return this._kerberosSignOnSettings;
    }
    /**
     * Gets the singleSignOnMode property value. The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased.
     * @return a singleSignOnMode
     */
    @javax.annotation.Nullable
    public SingleSignOnMode getSingleSignOnMode() {
        return this._singleSignOnMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("kerberosSignOnSettings", this.getKerberosSignOnSettings());
        writer.writeEnumValue("singleSignOnMode", this.getSingleSignOnMode());
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
     * Sets the kerberosSignOnSettings property value. The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.
     * @param value Value to set for the kerberosSignOnSettings property.
     * @return a void
     */
    public void setKerberosSignOnSettings(@javax.annotation.Nullable final KerberosSignOnSettings value) {
        this._kerberosSignOnSettings = value;
    }
    /**
     * Sets the singleSignOnMode property value. The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased.
     * @param value Value to set for the singleSignOnMode property.
     * @return a void
     */
    public void setSingleSignOnMode(@javax.annotation.Nullable final SingleSignOnMode value) {
        this._singleSignOnMode = value;
    }
}

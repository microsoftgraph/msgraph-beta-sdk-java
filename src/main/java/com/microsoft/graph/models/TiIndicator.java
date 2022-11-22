package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class TiIndicator extends Entity implements Parsable {
    /** The action to apply if the indicator is matched from within the targetProduct security tool. Possible values are: unknown, allow, block, alert. Required. */
    private TiAction _action;
    /** The cyber threat intelligence name(s) for the parties responsible for the malicious activity covered by the threat indicator. */
    private java.util.List<String> _activityGroupNames;
    /** A catchall area into which extra data from the indicator not covered by the other tiIndicator properties may be placed. Data placed into additionalInformation will typically not be utilized by the targetProduct security tool. */
    private String _additionalInformation;
    /** Stamped by the system when the indicator is ingested. The Azure Active Directory tenant id of submitting client. Required. */
    private String _azureTenantId;
    /** An integer representing the confidence the data within the indicator accurately identifies malicious behavior. Acceptable values are 0  100 with 100 being the highest. */
    private Integer _confidence;
    /** Brief description (100 characters or less) of the threat represented by the indicator. Required. */
    private String _description;
    /** The area of the Diamond Model in which this indicator exists. Possible values are: unknown, adversary, capability, infrastructure, victim. */
    private DiamondModel _diamondModel;
    /** The domainName property */
    private String _domainName;
    /** The emailEncoding property */
    private String _emailEncoding;
    /** The emailLanguage property */
    private String _emailLanguage;
    /** The emailRecipient property */
    private String _emailRecipient;
    /** The emailSenderAddress property */
    private String _emailSenderAddress;
    /** The emailSenderName property */
    private String _emailSenderName;
    /** The emailSourceDomain property */
    private String _emailSourceDomain;
    /** The emailSourceIpAddress property */
    private String _emailSourceIpAddress;
    /** The emailSubject property */
    private String _emailSubject;
    /** The emailXMailer property */
    private String _emailXMailer;
    /** DateTime string indicating when the Indicator expires. All indicators must have an expiration date to avoid stale indicators persisting in the system. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required. */
    private OffsetDateTime _expirationDateTime;
    /** An identification number that ties the indicator back to the indicator providers system (e.g. a foreign key). */
    private String _externalId;
    /** The fileCompileDateTime property */
    private OffsetDateTime _fileCompileDateTime;
    /** The fileCreatedDateTime property */
    private OffsetDateTime _fileCreatedDateTime;
    /** The fileHashType property */
    private FileHashType _fileHashType;
    /** The fileHashValue property */
    private String _fileHashValue;
    /** The fileMutexName property */
    private String _fileMutexName;
    /** The fileName property */
    private String _fileName;
    /** The filePacker property */
    private String _filePacker;
    /** The filePath property */
    private String _filePath;
    /** The fileSize property */
    private Long _fileSize;
    /** The fileType property */
    private String _fileType;
    /** Stamped by the system when the indicator is ingested. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _ingestedDateTime;
    /** Used to deactivate indicators within system. By default, any indicator submitted is set as active. However, providers may submit existing indicators with this set to False to deactivate indicators in the system. */
    private Boolean _isActive;
    /** A JSON array of strings that describes which point or points on the Kill Chain this indicator targets. See killChain values below for exact values. */
    private java.util.List<String> _killChain;
    /** Scenarios in which the indicator may cause false positives. This should be human-readable text. */
    private String _knownFalsePositives;
    /** The last time the indicator was seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastReportedDateTime;
    /** The malware family name associated with an indicator if it exists. Microsoft prefers the Microsoft malware family name if at all possible which can be found via the Windows Defender Security Intelligence threat encyclopedia. */
    private java.util.List<String> _malwareFamilyNames;
    /** The networkCidrBlock property */
    private String _networkCidrBlock;
    /** The networkDestinationAsn property */
    private Long _networkDestinationAsn;
    /** The networkDestinationCidrBlock property */
    private String _networkDestinationCidrBlock;
    /** The networkDestinationIPv4 property */
    private String _networkDestinationIPv4;
    /** The networkDestinationIPv6 property */
    private String _networkDestinationIPv6;
    /** The networkDestinationPort property */
    private Integer _networkDestinationPort;
    /** The networkIPv4 property */
    private String _networkIPv4;
    /** The networkIPv6 property */
    private String _networkIPv6;
    /** The networkPort property */
    private Integer _networkPort;
    /** The networkProtocol property */
    private Integer _networkProtocol;
    /** The networkSourceAsn property */
    private Long _networkSourceAsn;
    /** The networkSourceCidrBlock property */
    private String _networkSourceCidrBlock;
    /** The networkSourceIPv4 property */
    private String _networkSourceIPv4;
    /** The networkSourceIPv6 property */
    private String _networkSourceIPv6;
    /** The networkSourcePort property */
    private Integer _networkSourcePort;
    /** Determines if the indicator should trigger an event that is visible to an end-user. When set to true, security tools will not notify the end user that a hit has occurred. This is most often treated as audit or silent mode by security products where they will simply log that a match occurred but will not perform the action. Default value is false. */
    private Boolean _passiveOnly;
    /** An integer representing the severity of the malicious behavior identified by the data within the indicator. Acceptable values are 0  5 where 5 is the most severe and zero is not severe at all. Default value is 3. */
    private Integer _severity;
    /** A JSON array of strings that stores arbitrary tags/keywords. */
    private java.util.List<String> _tags;
    /** A string value representing a single security product to which the indicator should be applied. Acceptable values are: Azure Sentinel, Microsoft Defender ATP. Required */
    private String _targetProduct;
    /** Each indicator must have a valid Indicator Threat Type. Possible values are: Botnet, C2, CryptoMining, Darknet, DDoS, MaliciousUrl, Malware, Phishing, Proxy, PUA, WatchList. Required. */
    private String _threatType;
    /** Traffic Light Protocol value for the indicator. Possible values are: unknown, white, green, amber, red. Required. */
    private TlpLevel _tlpLevel;
    /** The url property */
    private String _url;
    /** The userAgent property */
    private String _userAgent;
    /**
     * Instantiates a new tiIndicator and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TiIndicator() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tiIndicator
     */
    @javax.annotation.Nonnull
    public static TiIndicator createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TiIndicator();
    }
    /**
     * Gets the action property value. The action to apply if the indicator is matched from within the targetProduct security tool. Possible values are: unknown, allow, block, alert. Required.
     * @return a tiAction
     */
    @javax.annotation.Nullable
    public TiAction getAction() {
        return this._action;
    }
    /**
     * Gets the activityGroupNames property value. The cyber threat intelligence name(s) for the parties responsible for the malicious activity covered by the threat indicator.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this._activityGroupNames;
    }
    /**
     * Gets the additionalInformation property value. A catchall area into which extra data from the indicator not covered by the other tiIndicator properties may be placed. Data placed into additionalInformation will typically not be utilized by the targetProduct security tool.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the azureTenantId property value. Stamped by the system when the indicator is ingested. The Azure Active Directory tenant id of submitting client. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * Gets the confidence property value. An integer representing the confidence the data within the indicator accurately identifies malicious behavior. Acceptable values are 0  100 with 100 being the highest.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidence() {
        return this._confidence;
    }
    /**
     * Gets the description property value. Brief description (100 characters or less) of the threat represented by the indicator. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the diamondModel property value. The area of the Diamond Model in which this indicator exists. Possible values are: unknown, adversary, capability, infrastructure, victim.
     * @return a diamondModel
     */
    @javax.annotation.Nullable
    public DiamondModel getDiamondModel() {
        return this._diamondModel;
    }
    /**
     * Gets the domainName property value. The domainName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * Gets the emailEncoding property value. The emailEncoding property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailEncoding() {
        return this._emailEncoding;
    }
    /**
     * Gets the emailLanguage property value. The emailLanguage property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailLanguage() {
        return this._emailLanguage;
    }
    /**
     * Gets the emailRecipient property value. The emailRecipient property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailRecipient() {
        return this._emailRecipient;
    }
    /**
     * Gets the emailSenderAddress property value. The emailSenderAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailSenderAddress() {
        return this._emailSenderAddress;
    }
    /**
     * Gets the emailSenderName property value. The emailSenderName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailSenderName() {
        return this._emailSenderName;
    }
    /**
     * Gets the emailSourceDomain property value. The emailSourceDomain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailSourceDomain() {
        return this._emailSourceDomain;
    }
    /**
     * Gets the emailSourceIpAddress property value. The emailSourceIpAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailSourceIpAddress() {
        return this._emailSourceIpAddress;
    }
    /**
     * Gets the emailSubject property value. The emailSubject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailSubject() {
        return this._emailSubject;
    }
    /**
     * Gets the emailXMailer property value. The emailXMailer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailXMailer() {
        return this._emailXMailer;
    }
    /**
     * Gets the expirationDateTime property value. DateTime string indicating when the Indicator expires. All indicators must have an expiration date to avoid stale indicators persisting in the system. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * Gets the externalId property value. An identification number that ties the indicator back to the indicator providers system (e.g. a foreign key).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(TiAction.class)); });
        deserializerMap.put("activityGroupNames", (n) -> { this.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("diamondModel", (n) -> { this.setDiamondModel(n.getEnumValue(DiamondModel.class)); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("emailEncoding", (n) -> { this.setEmailEncoding(n.getStringValue()); });
        deserializerMap.put("emailLanguage", (n) -> { this.setEmailLanguage(n.getStringValue()); });
        deserializerMap.put("emailRecipient", (n) -> { this.setEmailRecipient(n.getStringValue()); });
        deserializerMap.put("emailSenderAddress", (n) -> { this.setEmailSenderAddress(n.getStringValue()); });
        deserializerMap.put("emailSenderName", (n) -> { this.setEmailSenderName(n.getStringValue()); });
        deserializerMap.put("emailSourceDomain", (n) -> { this.setEmailSourceDomain(n.getStringValue()); });
        deserializerMap.put("emailSourceIpAddress", (n) -> { this.setEmailSourceIpAddress(n.getStringValue()); });
        deserializerMap.put("emailSubject", (n) -> { this.setEmailSubject(n.getStringValue()); });
        deserializerMap.put("emailXMailer", (n) -> { this.setEmailXMailer(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("fileCompileDateTime", (n) -> { this.setFileCompileDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileCreatedDateTime", (n) -> { this.setFileCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileHashType", (n) -> { this.setFileHashType(n.getEnumValue(FileHashType.class)); });
        deserializerMap.put("fileHashValue", (n) -> { this.setFileHashValue(n.getStringValue()); });
        deserializerMap.put("fileMutexName", (n) -> { this.setFileMutexName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("filePacker", (n) -> { this.setFilePacker(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("ingestedDateTime", (n) -> { this.setIngestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("killChain", (n) -> { this.setKillChain(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("knownFalsePositives", (n) -> { this.setKnownFalsePositives(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("malwareFamilyNames", (n) -> { this.setMalwareFamilyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("networkCidrBlock", (n) -> { this.setNetworkCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkDestinationAsn", (n) -> { this.setNetworkDestinationAsn(n.getLongValue()); });
        deserializerMap.put("networkDestinationCidrBlock", (n) -> { this.setNetworkDestinationCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkDestinationIPv4", (n) -> { this.setNetworkDestinationIPv4(n.getStringValue()); });
        deserializerMap.put("networkDestinationIPv6", (n) -> { this.setNetworkDestinationIPv6(n.getStringValue()); });
        deserializerMap.put("networkDestinationPort", (n) -> { this.setNetworkDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("networkIPv4", (n) -> { this.setNetworkIPv4(n.getStringValue()); });
        deserializerMap.put("networkIPv6", (n) -> { this.setNetworkIPv6(n.getStringValue()); });
        deserializerMap.put("networkPort", (n) -> { this.setNetworkPort(n.getIntegerValue()); });
        deserializerMap.put("networkProtocol", (n) -> { this.setNetworkProtocol(n.getIntegerValue()); });
        deserializerMap.put("networkSourceAsn", (n) -> { this.setNetworkSourceAsn(n.getLongValue()); });
        deserializerMap.put("networkSourceCidrBlock", (n) -> { this.setNetworkSourceCidrBlock(n.getStringValue()); });
        deserializerMap.put("networkSourceIPv4", (n) -> { this.setNetworkSourceIPv4(n.getStringValue()); });
        deserializerMap.put("networkSourceIPv6", (n) -> { this.setNetworkSourceIPv6(n.getStringValue()); });
        deserializerMap.put("networkSourcePort", (n) -> { this.setNetworkSourcePort(n.getIntegerValue()); });
        deserializerMap.put("passiveOnly", (n) -> { this.setPassiveOnly(n.getBooleanValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getIntegerValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetProduct", (n) -> { this.setTargetProduct(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getStringValue()); });
        deserializerMap.put("tlpLevel", (n) -> { this.setTlpLevel(n.getEnumValue(TlpLevel.class)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileCompileDateTime property value. The fileCompileDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFileCompileDateTime() {
        return this._fileCompileDateTime;
    }
    /**
     * Gets the fileCreatedDateTime property value. The fileCreatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFileCreatedDateTime() {
        return this._fileCreatedDateTime;
    }
    /**
     * Gets the fileHashType property value. The fileHashType property
     * @return a fileHashType
     */
    @javax.annotation.Nullable
    public FileHashType getFileHashType() {
        return this._fileHashType;
    }
    /**
     * Gets the fileHashValue property value. The fileHashValue property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileHashValue() {
        return this._fileHashValue;
    }
    /**
     * Gets the fileMutexName property value. The fileMutexName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileMutexName() {
        return this._fileMutexName;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the filePacker property value. The filePacker property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilePacker() {
        return this._filePacker;
    }
    /**
     * Gets the filePath property value. The filePath property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilePath() {
        return this._filePath;
    }
    /**
     * Gets the fileSize property value. The fileSize property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFileSize() {
        return this._fileSize;
    }
    /**
     * Gets the fileType property value. The fileType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileType() {
        return this._fileType;
    }
    /**
     * Gets the ingestedDateTime property value. Stamped by the system when the indicator is ingested. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getIngestedDateTime() {
        return this._ingestedDateTime;
    }
    /**
     * Gets the isActive property value. Used to deactivate indicators within system. By default, any indicator submitted is set as active. However, providers may submit existing indicators with this set to False to deactivate indicators in the system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the killChain property value. A JSON array of strings that describes which point or points on the Kill Chain this indicator targets. See killChain values below for exact values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKillChain() {
        return this._killChain;
    }
    /**
     * Gets the knownFalsePositives property value. Scenarios in which the indicator may cause false positives. This should be human-readable text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKnownFalsePositives() {
        return this._knownFalsePositives;
    }
    /**
     * Gets the lastReportedDateTime property value. The last time the indicator was seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the malwareFamilyNames property value. The malware family name associated with an indicator if it exists. Microsoft prefers the Microsoft malware family name if at all possible which can be found via the Windows Defender Security Intelligence threat encyclopedia.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMalwareFamilyNames() {
        return this._malwareFamilyNames;
    }
    /**
     * Gets the networkCidrBlock property value. The networkCidrBlock property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkCidrBlock() {
        return this._networkCidrBlock;
    }
    /**
     * Gets the networkDestinationAsn property value. The networkDestinationAsn property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNetworkDestinationAsn() {
        return this._networkDestinationAsn;
    }
    /**
     * Gets the networkDestinationCidrBlock property value. The networkDestinationCidrBlock property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkDestinationCidrBlock() {
        return this._networkDestinationCidrBlock;
    }
    /**
     * Gets the networkDestinationIPv4 property value. The networkDestinationIPv4 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkDestinationIPv4() {
        return this._networkDestinationIPv4;
    }
    /**
     * Gets the networkDestinationIPv6 property value. The networkDestinationIPv6 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkDestinationIPv6() {
        return this._networkDestinationIPv6;
    }
    /**
     * Gets the networkDestinationPort property value. The networkDestinationPort property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNetworkDestinationPort() {
        return this._networkDestinationPort;
    }
    /**
     * Gets the networkIPv4 property value. The networkIPv4 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkIPv4() {
        return this._networkIPv4;
    }
    /**
     * Gets the networkIPv6 property value. The networkIPv6 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkIPv6() {
        return this._networkIPv6;
    }
    /**
     * Gets the networkPort property value. The networkPort property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNetworkPort() {
        return this._networkPort;
    }
    /**
     * Gets the networkProtocol property value. The networkProtocol property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNetworkProtocol() {
        return this._networkProtocol;
    }
    /**
     * Gets the networkSourceAsn property value. The networkSourceAsn property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNetworkSourceAsn() {
        return this._networkSourceAsn;
    }
    /**
     * Gets the networkSourceCidrBlock property value. The networkSourceCidrBlock property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkSourceCidrBlock() {
        return this._networkSourceCidrBlock;
    }
    /**
     * Gets the networkSourceIPv4 property value. The networkSourceIPv4 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkSourceIPv4() {
        return this._networkSourceIPv4;
    }
    /**
     * Gets the networkSourceIPv6 property value. The networkSourceIPv6 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkSourceIPv6() {
        return this._networkSourceIPv6;
    }
    /**
     * Gets the networkSourcePort property value. The networkSourcePort property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNetworkSourcePort() {
        return this._networkSourcePort;
    }
    /**
     * Gets the passiveOnly property value. Determines if the indicator should trigger an event that is visible to an end-user. When set to true, security tools will not notify the end user that a hit has occurred. This is most often treated as audit or silent mode by security products where they will simply log that a match occurred but will not perform the action. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassiveOnly() {
        return this._passiveOnly;
    }
    /**
     * Gets the severity property value. An integer representing the severity of the malicious behavior identified by the data within the indicator. Acceptable values are 0  5 where 5 is the most severe and zero is not severe at all. Default value is 3.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSeverity() {
        return this._severity;
    }
    /**
     * Gets the tags property value. A JSON array of strings that stores arbitrary tags/keywords.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the targetProduct property value. A string value representing a single security product to which the indicator should be applied. Acceptable values are: Azure Sentinel, Microsoft Defender ATP. Required
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetProduct() {
        return this._targetProduct;
    }
    /**
     * Gets the threatType property value. Each indicator must have a valid Indicator Threat Type. Possible values are: Botnet, C2, CryptoMining, Darknet, DDoS, MaliciousUrl, Malware, Phishing, Proxy, PUA, WatchList. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThreatType() {
        return this._threatType;
    }
    /**
     * Gets the tlpLevel property value. Traffic Light Protocol value for the indicator. Possible values are: unknown, white, green, amber, red. Required.
     * @return a tlpLevel
     */
    @javax.annotation.Nullable
    public TlpLevel getTlpLevel() {
        return this._tlpLevel;
    }
    /**
     * Gets the url property value. The url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Gets the userAgent property value. The userAgent property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserAgent() {
        return this._userAgent;
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfPrimitiveValues("activityGroupNames", this.getActivityGroupNames());
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("diamondModel", this.getDiamondModel());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("emailEncoding", this.getEmailEncoding());
        writer.writeStringValue("emailLanguage", this.getEmailLanguage());
        writer.writeStringValue("emailRecipient", this.getEmailRecipient());
        writer.writeStringValue("emailSenderAddress", this.getEmailSenderAddress());
        writer.writeStringValue("emailSenderName", this.getEmailSenderName());
        writer.writeStringValue("emailSourceDomain", this.getEmailSourceDomain());
        writer.writeStringValue("emailSourceIpAddress", this.getEmailSourceIpAddress());
        writer.writeStringValue("emailSubject", this.getEmailSubject());
        writer.writeStringValue("emailXMailer", this.getEmailXMailer());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeOffsetDateTimeValue("fileCompileDateTime", this.getFileCompileDateTime());
        writer.writeOffsetDateTimeValue("fileCreatedDateTime", this.getFileCreatedDateTime());
        writer.writeEnumValue("fileHashType", this.getFileHashType());
        writer.writeStringValue("fileHashValue", this.getFileHashValue());
        writer.writeStringValue("fileMutexName", this.getFileMutexName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("filePacker", this.getFilePacker());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeOffsetDateTimeValue("ingestedDateTime", this.getIngestedDateTime());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeCollectionOfPrimitiveValues("killChain", this.getKillChain());
        writer.writeStringValue("knownFalsePositives", this.getKnownFalsePositives());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeCollectionOfPrimitiveValues("malwareFamilyNames", this.getMalwareFamilyNames());
        writer.writeStringValue("networkCidrBlock", this.getNetworkCidrBlock());
        writer.writeLongValue("networkDestinationAsn", this.getNetworkDestinationAsn());
        writer.writeStringValue("networkDestinationCidrBlock", this.getNetworkDestinationCidrBlock());
        writer.writeStringValue("networkDestinationIPv4", this.getNetworkDestinationIPv4());
        writer.writeStringValue("networkDestinationIPv6", this.getNetworkDestinationIPv6());
        writer.writeIntegerValue("networkDestinationPort", this.getNetworkDestinationPort());
        writer.writeStringValue("networkIPv4", this.getNetworkIPv4());
        writer.writeStringValue("networkIPv6", this.getNetworkIPv6());
        writer.writeIntegerValue("networkPort", this.getNetworkPort());
        writer.writeIntegerValue("networkProtocol", this.getNetworkProtocol());
        writer.writeLongValue("networkSourceAsn", this.getNetworkSourceAsn());
        writer.writeStringValue("networkSourceCidrBlock", this.getNetworkSourceCidrBlock());
        writer.writeStringValue("networkSourceIPv4", this.getNetworkSourceIPv4());
        writer.writeStringValue("networkSourceIPv6", this.getNetworkSourceIPv6());
        writer.writeIntegerValue("networkSourcePort", this.getNetworkSourcePort());
        writer.writeBooleanValue("passiveOnly", this.getPassiveOnly());
        writer.writeIntegerValue("severity", this.getSeverity());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("targetProduct", this.getTargetProduct());
        writer.writeStringValue("threatType", this.getThreatType());
        writer.writeEnumValue("tlpLevel", this.getTlpLevel());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("userAgent", this.getUserAgent());
    }
    /**
     * Sets the action property value. The action to apply if the indicator is matched from within the targetProduct security tool. Possible values are: unknown, allow, block, alert. Required.
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final TiAction value) {
        this._action = value;
    }
    /**
     * Sets the activityGroupNames property value. The cyber threat intelligence name(s) for the parties responsible for the malicious activity covered by the threat indicator.
     * @param value Value to set for the activityGroupNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityGroupNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._activityGroupNames = value;
    }
    /**
     * Sets the additionalInformation property value. A catchall area into which extra data from the indicator not covered by the other tiIndicator properties may be placed. Data placed into additionalInformation will typically not be utilized by the targetProduct security tool.
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the azureTenantId property value. Stamped by the system when the indicator is ingested. The Azure Active Directory tenant id of submitting client. Required.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the confidence property value. An integer representing the confidence the data within the indicator accurately identifies malicious behavior. Acceptable values are 0  100 with 100 being the highest.
     * @param value Value to set for the confidence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfidence(@javax.annotation.Nullable final Integer value) {
        this._confidence = value;
    }
    /**
     * Sets the description property value. Brief description (100 characters or less) of the threat represented by the indicator. Required.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the diamondModel property value. The area of the Diamond Model in which this indicator exists. Possible values are: unknown, adversary, capability, infrastructure, victim.
     * @param value Value to set for the diamondModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiamondModel(@javax.annotation.Nullable final DiamondModel value) {
        this._diamondModel = value;
    }
    /**
     * Sets the domainName property value. The domainName property
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the emailEncoding property value. The emailEncoding property
     * @param value Value to set for the emailEncoding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailEncoding(@javax.annotation.Nullable final String value) {
        this._emailEncoding = value;
    }
    /**
     * Sets the emailLanguage property value. The emailLanguage property
     * @param value Value to set for the emailLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailLanguage(@javax.annotation.Nullable final String value) {
        this._emailLanguage = value;
    }
    /**
     * Sets the emailRecipient property value. The emailRecipient property
     * @param value Value to set for the emailRecipient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailRecipient(@javax.annotation.Nullable final String value) {
        this._emailRecipient = value;
    }
    /**
     * Sets the emailSenderAddress property value. The emailSenderAddress property
     * @param value Value to set for the emailSenderAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSenderAddress(@javax.annotation.Nullable final String value) {
        this._emailSenderAddress = value;
    }
    /**
     * Sets the emailSenderName property value. The emailSenderName property
     * @param value Value to set for the emailSenderName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSenderName(@javax.annotation.Nullable final String value) {
        this._emailSenderName = value;
    }
    /**
     * Sets the emailSourceDomain property value. The emailSourceDomain property
     * @param value Value to set for the emailSourceDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSourceDomain(@javax.annotation.Nullable final String value) {
        this._emailSourceDomain = value;
    }
    /**
     * Sets the emailSourceIpAddress property value. The emailSourceIpAddress property
     * @param value Value to set for the emailSourceIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSourceIpAddress(@javax.annotation.Nullable final String value) {
        this._emailSourceIpAddress = value;
    }
    /**
     * Sets the emailSubject property value. The emailSubject property
     * @param value Value to set for the emailSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailSubject(@javax.annotation.Nullable final String value) {
        this._emailSubject = value;
    }
    /**
     * Sets the emailXMailer property value. The emailXMailer property
     * @param value Value to set for the emailXMailer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailXMailer(@javax.annotation.Nullable final String value) {
        this._emailXMailer = value;
    }
    /**
     * Sets the expirationDateTime property value. DateTime string indicating when the Indicator expires. All indicators must have an expiration date to avoid stale indicators persisting in the system. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the externalId property value. An identification number that ties the indicator back to the indicator providers system (e.g. a foreign key).
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the fileCompileDateTime property value. The fileCompileDateTime property
     * @param value Value to set for the fileCompileDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileCompileDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._fileCompileDateTime = value;
    }
    /**
     * Sets the fileCreatedDateTime property value. The fileCreatedDateTime property
     * @param value Value to set for the fileCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._fileCreatedDateTime = value;
    }
    /**
     * Sets the fileHashType property value. The fileHashType property
     * @param value Value to set for the fileHashType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHashType(@javax.annotation.Nullable final FileHashType value) {
        this._fileHashType = value;
    }
    /**
     * Sets the fileHashValue property value. The fileHashValue property
     * @param value Value to set for the fileHashValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHashValue(@javax.annotation.Nullable final String value) {
        this._fileHashValue = value;
    }
    /**
     * Sets the fileMutexName property value. The fileMutexName property
     * @param value Value to set for the fileMutexName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileMutexName(@javax.annotation.Nullable final String value) {
        this._fileMutexName = value;
    }
    /**
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the filePacker property value. The filePacker property
     * @param value Value to set for the filePacker property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePacker(@javax.annotation.Nullable final String value) {
        this._filePacker = value;
    }
    /**
     * Sets the filePath property value. The filePath property
     * @param value Value to set for the filePath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePath(@javax.annotation.Nullable final String value) {
        this._filePath = value;
    }
    /**
     * Sets the fileSize property value. The fileSize property
     * @param value Value to set for the fileSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileSize(@javax.annotation.Nullable final Long value) {
        this._fileSize = value;
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileType(@javax.annotation.Nullable final String value) {
        this._fileType = value;
    }
    /**
     * Sets the ingestedDateTime property value. Stamped by the system when the indicator is ingested. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the ingestedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIngestedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._ingestedDateTime = value;
    }
    /**
     * Sets the isActive property value. Used to deactivate indicators within system. By default, any indicator submitted is set as active. However, providers may submit existing indicators with this set to False to deactivate indicators in the system.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the killChain property value. A JSON array of strings that describes which point or points on the Kill Chain this indicator targets. See killChain values below for exact values.
     * @param value Value to set for the killChain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKillChain(@javax.annotation.Nullable final java.util.List<String> value) {
        this._killChain = value;
    }
    /**
     * Sets the knownFalsePositives property value. Scenarios in which the indicator may cause false positives. This should be human-readable text.
     * @param value Value to set for the knownFalsePositives property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKnownFalsePositives(@javax.annotation.Nullable final String value) {
        this._knownFalsePositives = value;
    }
    /**
     * Sets the lastReportedDateTime property value. The last time the indicator was seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the malwareFamilyNames property value. The malware family name associated with an indicator if it exists. Microsoft prefers the Microsoft malware family name if at all possible which can be found via the Windows Defender Security Intelligence threat encyclopedia.
     * @param value Value to set for the malwareFamilyNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMalwareFamilyNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._malwareFamilyNames = value;
    }
    /**
     * Sets the networkCidrBlock property value. The networkCidrBlock property
     * @param value Value to set for the networkCidrBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkCidrBlock(@javax.annotation.Nullable final String value) {
        this._networkCidrBlock = value;
    }
    /**
     * Sets the networkDestinationAsn property value. The networkDestinationAsn property
     * @param value Value to set for the networkDestinationAsn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkDestinationAsn(@javax.annotation.Nullable final Long value) {
        this._networkDestinationAsn = value;
    }
    /**
     * Sets the networkDestinationCidrBlock property value. The networkDestinationCidrBlock property
     * @param value Value to set for the networkDestinationCidrBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkDestinationCidrBlock(@javax.annotation.Nullable final String value) {
        this._networkDestinationCidrBlock = value;
    }
    /**
     * Sets the networkDestinationIPv4 property value. The networkDestinationIPv4 property
     * @param value Value to set for the networkDestinationIPv4 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkDestinationIPv4(@javax.annotation.Nullable final String value) {
        this._networkDestinationIPv4 = value;
    }
    /**
     * Sets the networkDestinationIPv6 property value. The networkDestinationIPv6 property
     * @param value Value to set for the networkDestinationIPv6 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkDestinationIPv6(@javax.annotation.Nullable final String value) {
        this._networkDestinationIPv6 = value;
    }
    /**
     * Sets the networkDestinationPort property value. The networkDestinationPort property
     * @param value Value to set for the networkDestinationPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkDestinationPort(@javax.annotation.Nullable final Integer value) {
        this._networkDestinationPort = value;
    }
    /**
     * Sets the networkIPv4 property value. The networkIPv4 property
     * @param value Value to set for the networkIPv4 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkIPv4(@javax.annotation.Nullable final String value) {
        this._networkIPv4 = value;
    }
    /**
     * Sets the networkIPv6 property value. The networkIPv6 property
     * @param value Value to set for the networkIPv6 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkIPv6(@javax.annotation.Nullable final String value) {
        this._networkIPv6 = value;
    }
    /**
     * Sets the networkPort property value. The networkPort property
     * @param value Value to set for the networkPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkPort(@javax.annotation.Nullable final Integer value) {
        this._networkPort = value;
    }
    /**
     * Sets the networkProtocol property value. The networkProtocol property
     * @param value Value to set for the networkProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProtocol(@javax.annotation.Nullable final Integer value) {
        this._networkProtocol = value;
    }
    /**
     * Sets the networkSourceAsn property value. The networkSourceAsn property
     * @param value Value to set for the networkSourceAsn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkSourceAsn(@javax.annotation.Nullable final Long value) {
        this._networkSourceAsn = value;
    }
    /**
     * Sets the networkSourceCidrBlock property value. The networkSourceCidrBlock property
     * @param value Value to set for the networkSourceCidrBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkSourceCidrBlock(@javax.annotation.Nullable final String value) {
        this._networkSourceCidrBlock = value;
    }
    /**
     * Sets the networkSourceIPv4 property value. The networkSourceIPv4 property
     * @param value Value to set for the networkSourceIPv4 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkSourceIPv4(@javax.annotation.Nullable final String value) {
        this._networkSourceIPv4 = value;
    }
    /**
     * Sets the networkSourceIPv6 property value. The networkSourceIPv6 property
     * @param value Value to set for the networkSourceIPv6 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkSourceIPv6(@javax.annotation.Nullable final String value) {
        this._networkSourceIPv6 = value;
    }
    /**
     * Sets the networkSourcePort property value. The networkSourcePort property
     * @param value Value to set for the networkSourcePort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkSourcePort(@javax.annotation.Nullable final Integer value) {
        this._networkSourcePort = value;
    }
    /**
     * Sets the passiveOnly property value. Determines if the indicator should trigger an event that is visible to an end-user. When set to true, security tools will not notify the end user that a hit has occurred. This is most often treated as audit or silent mode by security products where they will simply log that a match occurred but will not perform the action. Default value is false.
     * @param value Value to set for the passiveOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassiveOnly(@javax.annotation.Nullable final Boolean value) {
        this._passiveOnly = value;
    }
    /**
     * Sets the severity property value. An integer representing the severity of the malicious behavior identified by the data within the indicator. Acceptable values are 0  5 where 5 is the most severe and zero is not severe at all. Default value is 3.
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final Integer value) {
        this._severity = value;
    }
    /**
     * Sets the tags property value. A JSON array of strings that stores arbitrary tags/keywords.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the targetProduct property value. A string value representing a single security product to which the indicator should be applied. Acceptable values are: Azure Sentinel, Microsoft Defender ATP. Required
     * @param value Value to set for the targetProduct property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetProduct(@javax.annotation.Nullable final String value) {
        this._targetProduct = value;
    }
    /**
     * Sets the threatType property value. Each indicator must have a valid Indicator Threat Type. Possible values are: Botnet, C2, CryptoMining, Darknet, DDoS, MaliciousUrl, Malware, Phishing, Proxy, PUA, WatchList. Required.
     * @param value Value to set for the threatType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatType(@javax.annotation.Nullable final String value) {
        this._threatType = value;
    }
    /**
     * Sets the tlpLevel property value. Traffic Light Protocol value for the indicator. Possible values are: unknown, white, green, amber, red. Required.
     * @param value Value to set for the tlpLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTlpLevel(@javax.annotation.Nullable final TlpLevel value) {
        this._tlpLevel = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
    /**
     * Sets the userAgent property value. The userAgent property
     * @param value Value to set for the userAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAgent(@javax.annotation.Nullable final String value) {
        this._userAgent = value;
    }
}
